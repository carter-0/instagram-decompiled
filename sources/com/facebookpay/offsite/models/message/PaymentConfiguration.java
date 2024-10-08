package com.facebookpay.offsite.models.message;

import X.0qQ;
import X.C249703kE;
import X.C51974G9v;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import java.util.Set;

public final class PaymentConfiguration {
    @SerializedName("acquirerCountryCode")
    public final String acquirerCountryCode;
    @SerializedName("containerContext")
    public final String containerContext;
    @SerializedName("eventId")
    public final String eventId;
    @SerializedName("externalId")
    public final String externalId;
    @SerializedName("merchantName")
    public final String merchantName;
    @SerializedName("mode")
    public final PaymentMode mode;
    @SerializedName("partnerId")
    public final String partnerId;
    @SerializedName("partnerMerchantId")
    public final String partnerMerchantId;
    @SerializedName("pixelId")
    public final String pixelId;
    @SerializedName("requestId")
    public final String requestId;
    @SerializedName("sessionUsage")
    public final SessionUsageType sessionUsage;
    @SerializedName("shopName")
    public final String shopName;
    @SerializedName("supportedContainers")
    public final Map<PaymentContainerType, Map<String, Object>> supportedContainers;
    @SerializedName("uxFlags")
    public final Set<PaymentUXFlags> uxFlags;

    public final PaymentConfiguration createCopy(String str, String str2, String str3, Map map, PaymentMode paymentMode, String str4, String str5, String str6, String str7, Set set, SessionUsageType sessionUsageType, String str8, String str9, String str10) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        Map map2 = map;
        C51974G9v.A1O(str11, str12, str13, map2);
        String str14 = str7;
        0qQ.A0B(str14, 8);
        return new PaymentConfiguration(str11, str12, str13, map2, paymentMode, str4, str5, str6, str14, set, sessionUsageType, str8, str9, str10);
    }

    public final String getAcquirerCountryCode() {
        return this.acquirerCountryCode;
    }

    public final String getContainerContext() {
        return this.containerContext;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final PaymentMode getMode() {
        return this.mode;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getPartnerMerchantId() {
        return this.partnerMerchantId;
    }

    public final String getPixelId() {
        return this.pixelId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final SessionUsageType getSessionUsage() {
        return this.sessionUsage;
    }

    public final String getShopName() {
        return this.shopName;
    }

    public final Map getSupportedContainers() {
        return this.supportedContainers;
    }

    public final Set getUxFlags() {
        return this.uxFlags;
    }

    public PaymentConfiguration(String str, String str2, String str3, Map map, PaymentMode paymentMode, String str4, String str5, String str6, String str7, Set set, SessionUsageType sessionUsageType, String str8, String str9, String str10) {
        C51974G9v.A1P(str, str2, str3, map);
        0qQ.A0B(str7, 9);
        this.requestId = str;
        this.partnerId = str2;
        this.partnerMerchantId = str3;
        this.supportedContainers = map;
        this.mode = paymentMode;
        this.shopName = str4;
        this.acquirerCountryCode = str5;
        this.merchantName = str6;
        this.containerContext = str7;
        this.uxFlags = set;
        this.sessionUsage = sessionUsageType;
        this.eventId = str8;
        this.pixelId = str9;
        this.externalId = str10;
    }

    public static /* synthetic */ PaymentConfiguration createCopy$default(PaymentConfiguration paymentConfiguration, String str, String str2, String str3, Map map, PaymentMode paymentMode, String str4, String str5, String str6, String str7, Set set, SessionUsageType sessionUsageType, String str8, String str9, String str10, int i, Object obj) {
        String str11 = str2;
        String str12 = str3;
        Map map2 = map;
        PaymentMode paymentMode2 = paymentMode;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        Set set2 = set;
        SessionUsageType sessionUsageType2 = sessionUsageType;
        String str17 = str8;
        String str18 = str9;
        String str19 = str10;
        int i2 = i;
        PaymentConfiguration paymentConfiguration2 = paymentConfiguration;
        if ((i & 1) != 0) {
            str = paymentConfiguration2.requestId;
        }
        if ((i & 2) != 0) {
            str11 = paymentConfiguration2.partnerId;
        }
        if ((i & 4) != 0) {
            str12 = paymentConfiguration2.partnerMerchantId;
        }
        if ((i & 8) != 0) {
            map2 = paymentConfiguration2.supportedContainers;
        }
        if ((i & 16) != 0) {
            paymentMode2 = paymentConfiguration2.mode;
        }
        if ((i & 32) != 0) {
            str13 = paymentConfiguration2.shopName;
        }
        if ((i & 64) != 0) {
            str14 = paymentConfiguration2.acquirerCountryCode;
        }
        if ((i2 & 128) != 0) {
            str15 = paymentConfiguration2.merchantName;
        }
        if ((i2 & 256) != 0) {
            str16 = paymentConfiguration2.containerContext;
        }
        if ((i2 & 512) != 0) {
            set2 = paymentConfiguration2.uxFlags;
        }
        if ((i2 & 1024) != 0) {
            sessionUsageType2 = paymentConfiguration2.sessionUsage;
        }
        if ((i2 & C249703kE.FLAG_MOVED) != 0) {
            str17 = paymentConfiguration2.eventId;
        }
        if ((i2 & 4096) != 0) {
            str18 = paymentConfiguration2.pixelId;
        }
        if ((i2 & 8192) != 0) {
            str19 = paymentConfiguration2.externalId;
        }
        return paymentConfiguration2.createCopy(str, str11, str12, map2, paymentMode2, str13, str14, str15, str16, set2, sessionUsageType2, str17, str18, str19);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PaymentConfiguration(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.util.Map r7, com.facebookpay.offsite.models.message.PaymentMode r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.Set r13, com.facebookpay.offsite.models.message.SessionUsageType r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r3 = this;
            r2 = r18
            r0 = r2 & 128(0x80, float:1.794E-43)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r11 = r1
        L_0x0008:
            r0 = r2 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x000d
            r13 = r1
        L_0x000d:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0012
            r14 = r1
        L_0x0012:
            r0 = r2 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0017
            r15 = r1
        L_0x0017:
            r0 = r2 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x001d
            r16 = r1
        L_0x001d:
            r0 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0023
            r17 = r1
        L_0x0023:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.models.message.PaymentConfiguration.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.Map, com.facebookpay.offsite.models.message.PaymentMode, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Set, com.facebookpay.offsite.models.message.SessionUsageType, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
