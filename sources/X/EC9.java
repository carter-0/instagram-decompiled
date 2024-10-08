package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel;
import com.instagram.urlhandlers.smbeditpartner.SmbEditPartnerUrlHandlerActivity;
import java.util.List;

public final class EC9 extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public EC9(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A05 = str;
        this.A04 = str2;
    }

    public final void onFail(C268654dm r7) {
        int A032;
        int i;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(-162822597);
                K82.A01((K82) this.A03, (C45335Cud) null, this.A04, this.A05, false);
                ((BrandedContentDisclosureBaseViewModel) this.A02).A08(true);
                i = 1445547883;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(1798599925);
                String A002 = C66579MXk.A00(481);
                String A003 = C66579MXk.A00(563);
                0KC.A0D(A002, A003);
                OTW.A00((C254703su) null, this.A04, String.valueOf(((OIH) this.A02).A00), 002.A0R(this.A05, A003));
                ((0sP) this.A01).invoke((Object) null);
                i = -2016276995;
                break;
            default:
                A032 = AnonymousClass0fD.A03(-390937172);
                EC9.super.onFail(r7);
                ((Activity) this.A02).finish();
                i = -1843483781;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        String str;
        int i2;
        C254703su r7;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(1231737365);
                CF5 cf5 = (CF5) obj;
                int A0D = AnonymousClass7TG.A0D(cf5, -1371116915);
                K82 k82 = (K82) this.A03;
                K82.A01(k82, cf5.A00, this.A04, this.A05, true);
                if (cf5.A00 != null) {
                    Context requireContext = k82.requireContext();
                    C45335Cud cud = cf5.A00;
                    if (cud != null) {
                        C358248ab A0Y = DbS.A0Y(requireContext);
                        String str2 = cud.A01;
                        if (str2 != null) {
                            A0Y.A05 = str2;
                            String str3 = cud.A00;
                            if (str3 != null) {
                                A0Y.A0q(str3);
                                A0Y.A0E(FJ3.A00);
                                DbT.A1V(A0Y);
                            } else {
                                str = "displayMessage";
                            }
                        } else {
                            str = "displayTitle";
                        }
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    IllegalStateException A0y = AnonymousClass7TE.A0y();
                    AnonymousClass0fD.A0A(-1590159893, A0D);
                    throw A0y;
                }
                ((G5Q) this.A01).Dwt();
                AnonymousClass0fD.A0A(1363125453, A0D);
                i = 1462664157;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(962190578);
                C3265177b r15 = (C3265177b) obj;
                int A0D2 = AnonymousClass7TG.A0D(r15, -999906247);
                List list = r15.A00;
                if (list != null) {
                    list.size();
                }
                List list2 = r15.A00;
                if (list2 == null || (r7 = (C254703su) 00k.A0J(list2)) == null) {
                    OTW.A00((C254703su) null, this.A04, String.valueOf(((OIH) this.A02).A00), 002.A0R(this.A05, "Fetch supplemental message from EB finish with success but no message returns!"));
                    ((0sP) this.A01).invoke((Object) null);
                    i2 = -85150811;
                } else {
                    OTW.A00(r7, this.A04, String.valueOf(((OIH) this.A02).A00), (String) null);
                    ((0sP) this.A01).invoke(r7);
                    i2 = -1991396153;
                }
                AnonymousClass0fD.A0A(i2, A0D2);
                i = -786938785;
                break;
            default:
                A032 = AnonymousClass0fD.A03(34030080);
                C47334Dv1 dv1 = (C47334Dv1) obj;
                int A033 = AnonymousClass0fD.A03(2054543433);
                EC9.super.onSuccess(dv1);
                if (!dv1.A00.isEmpty()) {
                    ExP exP = (ExP) AnonymousClass7TE.A13(dv1.A00);
                    SmbEditPartnerUrlHandlerActivity smbEditPartnerUrlHandlerActivity = (SmbEditPartnerUrlHandlerActivity) this.A01;
                    AnonymousClass0wW r4 = smbEditPartnerUrlHandlerActivity.A00;
                    r4.getClass();
                    String str4 = this.A05;
                    String str5 = exP.A00;
                    String str6 = exP.A01;
                    String A034 = C324066yY.A03(exP);
                    String str7 = this.A04;
                    str7.getClass();
                    0qQ.A0B(str4, 3);
                    Dbb.A13(DbU.A0R().A06((SMBPartnerType) this.A03, str4, str5, str6, A034, (String) null, str7), (FragmentActivity) this.A02, r4);
                    smbEditPartnerUrlHandlerActivity.A0a();
                } else {
                    ((Activity) this.A02).finish();
                }
                AnonymousClass0fD.A0A(-1059986163, A033);
                i = -754641294;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
