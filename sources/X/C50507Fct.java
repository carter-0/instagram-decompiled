package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Fct  reason: case insensitive filesystem */
public final class C50507Fct implements C66491MTu {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass5HJ A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1YS A03;
    public final /* synthetic */ boolean A04;

    public final void onDismiss() {
    }

    public C50507Fct(FragmentActivity fragmentActivity, AnonymousClass5HJ r2, UserSession userSession, 1YS r4, boolean z) {
        this.A03 = r4;
        this.A04 = z;
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public final void D1x(Context context) {
        double d;
        double d2;
        double d3;
        double d4;
        try {
            if (this.A04) {
                DdU.A01(this.A02, this.A00);
                return;
            }
            AnonymousClass5HJ r7 = this.A01;
            String str = r7.A0k;
            String str2 = r7.A0p;
            String str3 = r7.A0m;
            String str4 = r7.A0o;
            String str5 = r7.A0q;
            AnonymousClass1YQ r0 = AnonymousClass1YQ.A00;
            if (r0 != null) {
                1YR r8 = ((AnonymousClass1YP) r0).A00;
                String str6 = r7.A0l;
                if (str6 != null) {
                    d3 = Double.parseDouble(str6);
                } else {
                    d3 = 0.0d;
                }
                String str7 = r7.A0n;
                if (str7 != null) {
                    d4 = Double.parseDouble(str7);
                } else {
                    d4 = 0.0d;
                }
                String str8 = "";
                String str9 = str8;
                if (str != null) {
                    str9 = str;
                }
                String str10 = str8;
                if (str2 != null) {
                    str10 = str2;
                }
                String str11 = str8;
                if (str3 != null) {
                    str11 = str3;
                }
                String str12 = str8;
                if (str4 != null) {
                    str12 = str4;
                }
                if (str5 != null) {
                    str8 = str5;
                }
                Dbb.A12(r8.A00(AnonymousClass05K.A00, str9, str10, str11, str12, str8, d3, d4), this.A00, this.A02);
                return;
            }
            DbS.A15();
            throw AnonymousClass00P.createAndThrow();
        } catch (IllegalArgumentException unused) {
            if (!this.A04) {
                UserSession userSession = this.A02;
                Class<ModalActivity> cls = ModalActivity.class;
                1YS r4 = this.A03;
                AnonymousClass5HJ r13 = this.A01;
                String str13 = r13.A0k;
                String str14 = r13.A0p;
                String str15 = r13.A0m;
                String str16 = r13.A0o;
                String str17 = r13.A0q;
                Bundle A0a = AnonymousClass7TE.A0a();
                String str18 = r13.A0l;
                if (str18 != null) {
                    d = Double.parseDouble(str18);
                } else {
                    d = 0.0d;
                }
                A0a.putDouble("ARG_LOCATION_LATITUDE", d);
                String str19 = r13.A0n;
                if (str19 != null) {
                    d2 = Double.parseDouble(str19);
                } else {
                    d2 = 0.0d;
                }
                A0a.putDouble("ARG_LOCATION_LONGITUDE", d2);
                if (str13 == null) {
                    str13 = "";
                }
                A0a.putString("ARG_DEVICE_NAME", str13);
                if (str14 == null) {
                    str14 = "";
                }
                A0a.putString("ARG_TIMESTAMP", str14);
                if (str15 == null) {
                    str15 = "";
                }
                A0a.putString("ARG_LOCATION_NAME", str15);
                if (str16 == null) {
                    str16 = "";
                }
                A0a.putString("ARG_REQUEST_DEVICE_ID", str16);
                A0a.putInt("ARG_USER_ACTION", 0);
                if (str17 == null) {
                    str17 = "";
                }
                A0a.putString("ARG_TWO_FAC_IDENTIFIER", str17);
                Dba.A0K(this.A00, A0a, userSession, cls, "login_notification").A0C(r4.A00);
            }
        }
    }
}
