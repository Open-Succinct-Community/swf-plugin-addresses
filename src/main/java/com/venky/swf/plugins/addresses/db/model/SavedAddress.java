package com.venky.swf.plugins.addresses.db.model;

import com.venky.core.util.Bucket;
import com.venky.swf.db.annotations.column.COLUMN_DEF;
import com.venky.swf.db.annotations.column.UNIQUE_KEY;
import com.venky.swf.db.annotations.column.defaulting.StandardDefault;
import com.venky.swf.db.model.Model;
import com.venky.swf.plugins.collab.db.model.participants.admin.Address;
import in.succinct.plugins.ecommerce.db.model.participation.User;

public interface SavedAddress extends Model, Address {
    @UNIQUE_KEY
    public long getUserId();
    public void setUserId(long id);
    public User getUser();

    @UNIQUE_KEY(allowMultipleRecordsWithNull = false)
    public String getFirstName();
    public void setFirstName(String firstName);

    @UNIQUE_KEY(allowMultipleRecordsWithNull = false)
    public String getLastName();
    public void setLastName(String firstName);


    @UNIQUE_KEY(allowMultipleRecordsWithNull = false)
    public String getAddressLine1();

    @UNIQUE_KEY(allowMultipleRecordsWithNull = false)
    public String getAddressLine2();

    @UNIQUE_KEY(allowMultipleRecordsWithNull = false)
    public String getAddressLine3();

    @UNIQUE_KEY(allowMultipleRecordsWithNull = false)
    public String getAddressLine4();

    @UNIQUE_KEY(allowMultipleRecordsWithNull = false)
    public Long getCityId();

    @UNIQUE_KEY(allowMultipleRecordsWithNull = false)
    public Long getStateId();

    @UNIQUE_KEY(allowMultipleRecordsWithNull = false)
    public Long getCountryId();

    @UNIQUE_KEY(allowMultipleRecordsWithNull = false)
    public Long getPinCodeId();


    @COLUMN_DEF(StandardDefault.ZERO)
    public Bucket getNumDeliveries();
    public void setNumDeliveries(Bucket bucket);
}
