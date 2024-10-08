package com.instagram.leadgen.core.api;

import X.0oU;
import X.DbY;
import X.Dbb;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.LinkedHashMap;
import java.util.Map;

public enum LeadGenInfoFieldTypes implements Parcelable {
    UNRECOGNIZED("LeadGenInfoFieldTypes_unspecified"),
    CUSTOM("CUSTOM"),
    CITY("CITY"),
    COMPANY_NAME("COMPANY_NAME"),
    COUNTRY("COUNTRY"),
    DOB("DOB"),
    A0A(PaymentDetailChangeTypes$Companion.EMAIL),
    GENDER("GENDER"),
    FIRST_NAME("FIRST_NAME"),
    FULL_ADDRESS("FULL_ADDRESS"),
    FULL_NAME("FULL_NAME"),
    JOB_TITLE("JOB_TITLE"),
    LAST_NAME("LAST_NAME"),
    MARITIAL_STATUS("MARITIAL_STATUS"),
    PHONE("PHONE"),
    POST_CODE("POST_CODE"),
    PROVINCE("PROVINCE"),
    RELATIONSHIP_STATUS("RELATIONSHIP_STATUS"),
    STATE("STATE"),
    STREET_ADDRESS("STREET_ADDRESS"),
    ZIP("ZIP"),
    WORK_EMAIL("WORK_EMAIL"),
    MILITARY_STATUS("MILITARY_STATUS"),
    WORK_PHONE_NUMBER("WORK_PHONE_NUMBER"),
    STORE_LOOKUP("STORE_LOOKUP"),
    STORE_LOOKUP_WITH_TYPEAHEAD("STORE_LOOKUP_WITH_TYPEAHEAD"),
    DATE_TIME("DATE_TIME"),
    ID_CPF("ID_CPF"),
    ID_AR_DNI("ID_AR_DNI"),
    ID_CL_RUT("ID_CL_RUT"),
    ID_CO_CC("ID_CO_CC"),
    ID_EC_CI("ID_EC_CI"),
    ID_PE_DNI("ID_PE_DNI");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LeadGenInfoFieldTypes[] leadGenInfoFieldTypesArr;
        A02 = 0oU.A00(leadGenInfoFieldTypesArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r4));
        for (LeadGenInfoFieldTypes leadGenInfoFieldTypes : values()) {
            linkedHashMap.put(leadGenInfoFieldTypes.A00, leadGenInfoFieldTypes);
        }
        A01 = linkedHashMap;
        CREATOR = new W6E(84);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    LeadGenInfoFieldTypes(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
