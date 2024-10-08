package com.instagram.registration.model;

import X.0lg;
import X.0mp;
import X.0qv;
import X.17W;
import X.1NY;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C17958Vir;
import X.C17959Vis;
import X.C18559VuB;
import X.C49512Ewr;
import X.DbT;
import X.Dd6;
import X.EXD;
import X.W6F;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.instagram.phonenumber.model.CountryCodeData;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class RegFlowExtras implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(8);
    public long A00;
    public CountryCodeData A01;
    public C17959Vis A02;
    public UserBirthDate A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
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
    public List A0e;
    public List A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m = false;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u = false;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;

    public final EXD A01() {
        try {
            String str = this.A0S;
            if (str != null) {
                return EXD.valueOf(str);
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final Integer A02() {
        try {
            String str = this.A0V;
            if (str != null) {
                if (str.equals(PaymentDetailChangeTypes$Companion.EMAIL)) {
                    return AnonymousClass05K.A00;
                }
                if (str.equals("PHONE_REG")) {
                    return AnonymousClass05K.A01;
                }
                if (str.equals("MAIN_ACCOUNT")) {
                    return AnonymousClass05K.A0C;
                }
                if (str.equals("SIMPLE_SAC")) {
                    return AnonymousClass05K.A0N;
                }
                if (str.equals("ADD_PHONE")) {
                    return AnonymousClass05K.A0Y;
                }
                if (str.equals("SAC_CAL")) {
                    return AnonymousClass05K.A0j;
                }
                if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
                    return AnonymousClass05K.A0u;
                }
                throw AnonymousClass7TE.A0w(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr;
        ArrayList arrayList;
        int i2;
        String str;
        parcel.writeParcelable(this.A01, 0);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0Z);
        parcel.writeString(this.A0W);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0X);
        parcel.writeLong(this.A00);
        parcel.writeByte(this.A0n ? (byte) 1 : 0);
        parcel.writeByte(this.A10 ? (byte) 1 : 0);
        parcel.writeByte(this.A0h ? (byte) 1 : 0);
        parcel.writeByte(this.A0q ? (byte) 1 : 0);
        parcel.writeByte(this.A0w ? (byte) 1 : 0);
        parcel.writeByte(this.A0g ? (byte) 1 : 0);
        parcel.writeByte(this.A12 ? (byte) 1 : 0);
        parcel.writeByte(this.A0s ? (byte) 1 : 0);
        parcel.writeByte(this.A0v ? (byte) 1 : 0);
        parcel.writeByte(this.A0k ? (byte) 1 : 0);
        parcel.writeByte(this.A0u ? (byte) 1 : 0);
        parcel.writeByte(this.A11 ? (byte) 1 : 0);
        parcel.writeParcelable(this.A03, 0);
        parcel.writeStringList(this.A0e);
        List list = this.A0f;
        if (list != null) {
            strArr = new String[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                C49512Ewr ewr = (C49512Ewr) list.get(i3);
                try {
                    StringWriter stringWriter = new StringWriter();
                    17W A0K2 = AnonymousClass7TF.A0K(stringWriter);
                    String str2 = ewr.A01;
                    if (str2 != null) {
                        A0K2.A0R(Dd6.A00(), str2);
                    }
                    String str3 = ewr.A00;
                    if (str3 != null) {
                        A0K2.A0R("prototype", str3);
                    }
                    str = AnonymousClass7TG.A0k(A0K2, stringWriter);
                } catch (IOException unused) {
                    str = null;
                }
                strArr[i3] = str;
            }
        } else {
            strArr = null;
        }
        parcel.writeStringArray(strArr);
        C17959Vis vis = this.A02;
        if (vis != null) {
            arrayList = AnonymousClass7TE.A1C();
            for (C17958Vir vir : vis.A00) {
                arrayList.add(vir.A00);
            }
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = -1;
        }
        parcel.writeInt(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = arrayList.get(i4);
            obj.getClass();
            parcel.writeList((List) obj);
        }
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0V);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeByte(this.A0l ? (byte) 1 : 0);
        parcel.writeByte(this.A0x ? (byte) 1 : 0);
        parcel.writeString(this.A0Y);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0T);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A09);
        parcel.writeByte(this.A0r ? (byte) 1 : 0);
        parcel.writeByte(this.A0m ? (byte) 1 : 0);
        parcel.writeString(this.A0b);
        parcel.writeString(this.A0d);
        parcel.writeString(this.A0c);
        parcel.writeString(this.A0a);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0G);
        parcel.writeByte(this.A0t ? (byte) 1 : 0);
        parcel.writeByte(this.A0y ? (byte) 1 : 0);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0I);
        parcel.writeByte(this.A0z ? (byte) 1 : 0);
        parcel.writeByte(this.A0i ? (byte) 1 : 0);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeByte(this.A0o ? (byte) 1 : 0);
        parcel.writeByte(this.A0p ? (byte) 1 : 0);
        parcel.writeByte(this.A0j ? (byte) 1 : 0);
    }

    public static void A00(Context context, 1NY r6, 0lg r7, RegFlowExtras regFlowExtras, boolean z) {
        String str;
        context.getClass();
        if (!TextUtils.isEmpty(regFlowExtras.A08)) {
            String str2 = regFlowExtras.A08;
            Pattern pattern = 0mp.A01;
            if (str2 == null) {
                str2 = "";
            }
            r6.A9m("email", str2);
        }
        String str3 = regFlowExtras.A0Z;
        Pattern pattern2 = 0mp.A01;
        if (str3 == null) {
            str3 = "";
        }
        r6.A9m(Dd6.A00(), str3);
        String str4 = regFlowExtras.A0W;
        if (str4 == null) {
            str4 = "";
        }
        r6.A9m("suggestedUsername", str4);
        if (!regFlowExtras.A11) {
            C18559VuB vuB = new C18559VuB(r7);
            String str5 = regFlowExtras.A0P;
            if (str5 == null) {
                str5 = "";
            }
            r6.A9m("enc_password", vuB.A00(str5));
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0Q)) {
            String str6 = regFlowExtras.A0Q;
            if (str6 == null) {
                str6 = "";
            }
            r6.A9m(Dd6.A02(9, 12, 42), str6);
        }
        String A002 = 0qv.A00(context);
        if (A002 == null) {
            A002 = "";
        }
        r6.A9m(Dd6.A02(0, 9, 40), A002);
        String A0s2 = DbT.A0s(context);
        if (A0s2 == null) {
            A0s2 = "";
        }
        r6.A9m("guid", A0s2);
        boolean z2 = regFlowExtras.A0i;
        String str7 = regFlowExtras.A0O;
        if (str7 == null) {
            str7 = "";
        }
        if (z2) {
            str = "group_full_name";
        } else {
            str = "first_name";
        }
        r6.A9m(str, str7);
        String str8 = regFlowExtras.A0B;
        if (str8 == null) {
            str8 = "";
        }
        r6.A9m("force_sign_up_code", str8);
        if (!TextUtils.isEmpty(regFlowExtras.A05)) {
            String str9 = regFlowExtras.A05;
            if (str9 == null) {
                str9 = "";
            }
            r6.A9m(Dd6.A02(63, 17, 83), str9);
        }
        if (regFlowExtras.A10) {
            r6.A9m("skip_email", "true");
        }
        if (regFlowExtras.A0h) {
            r6.A9m(AnonymousClass000.A00(245), "true");
        }
        if (regFlowExtras.A0q) {
            r6.A9m("has_sms_consent", "true");
        }
        if (regFlowExtras.A0l) {
            r6.A9m("force_create_account", "true");
        }
        if (regFlowExtras.A0x) {
            r6.A9m("requested_username_change", "true");
        }
        if (regFlowExtras.A0w) {
            r6.A9m("one_tap_opt_in", "true");
        }
        if (regFlowExtras.A11) {
            r6.A9m("skip_password_setup", "true");
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0C)) {
            r6.A9m("gdpr_s", regFlowExtras.A0C);
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0D)) {
            r6.A9m(AnonymousClass000.A00(3277), regFlowExtras.A0D);
        }
        if (!TextUtils.isEmpty(regFlowExtras.A0X)) {
            r6.A9m("tos_version", regFlowExtras.A0X);
        }
        C17959Vis vis = regFlowExtras.A02;
        if (vis != null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C17958Vir vir : vis.A00) {
                A1C.add(vir.A00);
            }
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                for (Object obj : (List) it.next()) {
                    A1A.append(obj.toString());
                    A1A.append(",");
                }
                if (A1A.length() > 0) {
                    A1A.deleteCharAt(A1A.length() - 1);
                }
                A1A.append("|");
            }
            if (A1A.length() > 0) {
                A1A.deleteCharAt(A1A.length() - 1);
            }
            r6.A9m("qs_stamp", A1A.toString());
        }
        if (regFlowExtras.A0z) {
            r6.A9m("should_link_to_main", "true");
        }
        if (regFlowExtras.A0i) {
            r6.A9m("convert_to_group", "true");
            String str10 = regFlowExtras.A0E;
            if (str10 != null) {
                r6.A9m("group_biography", str10);
            }
            String str11 = regFlowExtras.A0F;
            if (str11 != null) {
                r6.A9m("group_external_url", str11);
            }
            if (regFlowExtras.A0o) {
                r6.A9m("group_should_be_private", "true");
            }
            if (regFlowExtras.A0p) {
                r6.A9m(AnonymousClass000.A00(153), "true");
            }
            if (regFlowExtras.A0j) {
                r6.A9m("create_group_thread", "true");
            }
        }
        String str12 = regFlowExtras.A07;
        if (str12 != null) {
            r6.A9m("sn_result", str12);
        }
        String str13 = regFlowExtras.A06;
        if (str13 != null) {
            r6.A9m("sn_nonce", str13);
        }
        if (z) {
            r6.A0L(new String[]{AnonymousClass000.A00(1718)});
        }
    }

    public final void A03(EXD exd) {
        this.A0S = exd.name();
    }
}
