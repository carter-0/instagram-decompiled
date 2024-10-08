package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.LimitedInteractionsVersions;

/* renamed from: X.923  reason: invalid class name */
public final class AnonymousClass923 extends 1P0 {
    public final /* synthetic */ AnonymousClass921 A00;

    public AnonymousClass923(AnonymousClass921 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C358248ab r2;
        int i;
        int A03 = AnonymousClass0fD.A03(-963741723);
        AnonymousClass927 r12 = (AnonymousClass927) obj;
        int A032 = AnonymousClass0fD.A03(-765085451);
        0qQ.A0B(r12, 0);
        C294465mV r6 = r12.A01;
        if (r6 == null) {
            0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw AnonymousClass00P.createAndThrow();
        }
        C294455mU r62 = (C294455mU) r6;
        if (r62.A03) {
            AnonymousClass921 r5 = this.A00;
            LimitedInteractionsVersions limitedInteractionsVersions = r62.A02;
            if (limitedInteractionsVersions == null) {
                limitedInteractionsVersions = LimitedInteractionsVersions.V1;
            }
            r5.A00 = limitedInteractionsVersions;
            int i2 = r62.A00;
            boolean z = false;
            if (limitedInteractionsVersions != LimitedInteractionsVersions.V1) {
                z = true;
            }
            C294475mW r9 = r62.A01;
            FragmentActivity fragmentActivity = r5.A02;
            if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
                if (z) {
                    0wc A02 = AnonymousClass0kN.A02(r5.A05);
                    String str = r5.A09;
                    boolean z2 = false;
                    if (r5.A00 == LimitedInteractionsVersions.V2_CUSTOMIZABLE) {
                        z2 = true;
                    }
                    I4R.A00(A02, str, "reminder", z2);
                    r2 = new C358248ab((Activity) fragmentActivity);
                    Context context = r5.A01;
                    r2.A0j(context.getDrawable(R.drawable.ig_illustrations_illo_limits_refresh));
                    r2.A09(2131965015);
                    String string = context.getString(2131965013);
                    0qQ.A07(string);
                    r2.A0Y(new C71178Oeu(r5), C358278ae.BLUE_BOLD, string, true);
                    String string2 = context.getString(2131965014);
                    0qQ.A07(string2);
                    r2.A0a(new C71179Oev(r5), string2);
                    if (r9 != null) {
                        if (r9.A01) {
                            i = 2131965016;
                        } else {
                            boolean z3 = r9.A02;
                            if (!z3 || !r9.A00) {
                                i = 2131965018;
                                if (z3) {
                                    i = 2131965017;
                                }
                            } else {
                                i = 2131965019;
                            }
                        }
                        r2.A0q(context.getString(i));
                    }
                } else {
                    new C56029Hrb(r5.A03, r5.A05, r5.A09).A00(AnonymousClass05K.A0C);
                    r2 = new C358248ab((Activity) fragmentActivity);
                    Context context2 = r5.A01;
                    r2.A0j(context2.getDrawable(R.drawable.ig_illustrations_illo_limited_interactions_refresh));
                    Resources resources = context2.getResources();
                    Integer valueOf = Integer.valueOf(i2);
                    r2.A05 = resources.getQuantityString(R.plurals.limited_interactions_reminder_dialog_title_day, i2, new Object[]{valueOf, valueOf});
                    r2.A08(2131964978);
                    String string3 = context2.getString(2131964979);
                    0qQ.A07(string3);
                    r2.A0d(new C71180Oew(r5), string3);
                    String string4 = context2.getString(2131964980);
                    0qQ.A07(string4);
                    r2.A0a(new C71181Oex(r5), string4);
                }
                AnonymousClass0fN.A00(r2.A02());
            }
        }
        AnonymousClass0fD.A0A(-1320701352, A032);
        AnonymousClass0fD.A0A(975842942, A03);
    }
}
