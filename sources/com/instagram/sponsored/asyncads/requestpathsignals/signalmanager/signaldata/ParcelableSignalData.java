package com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata;

import X.AnonymousClass000;
import X.AnonymousClass0T0;
import X.AnonymousClass4EC;
import X.AnonymousClass9JO;
import X.C230432pc;
import X.C230472pg;
import X.C233162v9;
import X.C66579MXk;
import X.Pxd;
import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import java.util.Map;

@AutoGenJsonDeserializer
@AutoGenJsonSerializer
@JsonDeserialize(using = ParcelableSignalDataDeserializer.class)
@JsonSerialize(using = ParcelableSignalDataSerializer.class)
public final class ParcelableSignalData extends AnonymousClass0T0 {
    public AnonymousClass9JO A00;
    public C230472pg A01;
    public AnonymousClass4EC A02;
    public C233162v9 A03;
    public C230432pc A04;
    public Boolean A05;
    public Boolean A06;
    public Float A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public List A0f;
    public Map A0g;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ParcelableSignalData(signalId=");
        sb.append(this.A0a);
        sb.append(", signalType=");
        sb.append(this.A03);
        sb.append(", signalStatus=");
        sb.append(this.A02);
        sb.append(", surfaceType=");
        sb.append(this.A04);
        sb.append(", itemId=");
        sb.append(this.A0V);
        sb.append(C66579MXk.A00(80));
        sb.append(this.A01);
        sb.append(Pxd.A00(50));
        sb.append(this.A0Z);
        sb.append(", mediaId=");
        sb.append(this.A0W);
        sb.append(", mediaTimeSpent=");
        sb.append(this.A0K);
        sb.append(", mediaLastSeenTimestamp=");
        sb.append(this.A0J);
        sb.append(", mediaPercentVisible=");
        sb.append(this.A07);
        sb.append(", containerModule=");
        sb.append(this.A0T);
        sb.append(", inventorySource=");
        sb.append(this.A0U);
        sb.append(", authorId=");
        sb.append(this.A0R);
        sb.append(", mediaIds=");
        sb.append(this.A0f);
        sb.append(", clickTimestamp=");
        sb.append(this.A0H);
        sb.append(", clickMediaId=");
        sb.append(this.A0S);
        sb.append(", xoutTimestamp=");
        sb.append(this.A0M);
        sb.append(", xoutMediaId=");
        sb.append(this.A0e);
        sb.append(Pxd.A00(49));
        sb.append(this.A0Y);
        sb.append(", metaId=");
        sb.append(this.A00);
        sb.append(", signalTimestamp=");
        sb.append(this.A0L);
        sb.append(", signalMediaId=");
        sb.append(this.A0b);
        sb.append(", accountType=");
        sb.append(this.A0N);
        sb.append(", multiAdsType=");
        sb.append(this.A0E);
        sb.append(", gapToLastAd=");
        sb.append(this.A0B);
        sb.append(", gapToLastNetego=");
        sb.append(this.A0C);
        sb.append(", clientInsertionPosition=");
        sb.append(this.A0A);
        sb.append(AnonymousClass000.A00(2043));
        sb.append(this.A0G);
        sb.append(AnonymousClass000.A00(1994));
        sb.append(this.A08);
        sb.append(", numMediaConsumedInAd=");
        sb.append(this.A0F);
        sb.append(", trackingToken=");
        sb.append(this.A0c);
        sb.append(", impSignature=");
        sb.append(this.A0D);
        sb.append(", afiId=");
        sb.append(this.A0O);
        sb.append(", extraData=");
        sb.append(this.A0g);
        sb.append(", afiType=");
        sb.append(this.A0P);
        sb.append(", globalPosition=");
        sb.append(this.A0I);
        sb.append(", questionId=");
        sb.append(this.A0X);
        sb.append(", triggerSource=");
        sb.append(this.A0d);
        sb.append(", answerId=");
        sb.append(this.A0Q);
        sb.append(", afiEventType=");
        Integer num = this.A09;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "RESPONSE";
        } else {
            str = "UNDO";
        }
        sb.append(str);
        sb.append(", noBounceClientLogging=");
        sb.append(this.A06);
        sb.append(", isAdClick=");
        sb.append(this.A05);
        sb.append(')');
        return sb.toString();
    }

    public ParcelableSignalData(C230472pg r3, Boolean bool, Boolean bool2, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, Map map) {
        this.A0a = null;
        this.A03 = null;
        this.A02 = null;
        this.A04 = null;
        this.A0V = str;
        this.A01 = r3;
        this.A0Z = str2;
        this.A0W = str3;
        this.A0K = l;
        this.A0J = l2;
        this.A07 = f;
        this.A0T = str4;
        this.A0U = str5;
        this.A0R = str6;
        this.A0f = list;
        this.A0H = l3;
        this.A0S = str7;
        this.A0M = l4;
        this.A0e = str8;
        this.A0Y = str9;
        this.A00 = null;
        this.A0L = l5;
        this.A0b = str10;
        this.A0N = str11;
        this.A0E = num;
        this.A0B = num2;
        this.A0C = num3;
        this.A0A = num4;
        this.A0G = num5;
        this.A08 = num6;
        this.A0F = num7;
        this.A0c = str12;
        this.A0D = num8;
        this.A0O = str13;
        this.A0g = map;
        this.A0P = str14;
        this.A0I = l6;
        this.A0X = str15;
        this.A0d = str16;
        this.A0Q = str17;
        this.A09 = num9;
        this.A06 = bool;
        this.A05 = bool2;
    }

    public ParcelableSignalData() {
        this((C230472pg) null, (Boolean) null, (Boolean) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Map) null);
    }
}
