package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.R8o  reason: case insensitive filesystem */
public final class C8763R8o extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public C8763R8o(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj2;
        this.A05 = z;
        this.A03 = obj;
        this.A04 = obj4;
    }

    public final void onFail(C268654dm r6) {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(826347082);
                UserSession userSession = (UserSession) this.A04;
                boolean z = this.A05;
                FEG.A00(userSession, (Reel) this.A03, !z);
                Context context = (Context) this.A01;
                int i3 = 2131975959;
                if (z) {
                    i3 = 2131967926;
                }
                String string = context.getString(i3);
                if (z) {
                    str = "mute_story_failure";
                } else {
                    str = "unmute_story_failure";
                }
                C59689JTv.A03(context, string, str, 0);
                i2 = 1946316798;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-919260783);
                ((1P0) this.A01).onFail(r6);
                Object A002 = r6.A00();
                if (A002 != null) {
                    C59689JTv.A09((Context) this.A02, ((DwR) A002).A02);
                }
                i2 = 2113683663;
                break;
            default:
                C8763R8o.super.onFail(r6);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(-1184525164);
                int A032 = AnonymousClass0fD.A03(332253478);
                boolean z = this.A05;
                ((C10315RqD) this.A02).A00.A0D(true);
                Context context = (Context) this.A01;
                int i3 = 2131967924;
                if (z) {
                    i3 = 2131967923;
                }
                C59689JTv.A09(context, context.getString(i3));
                AnonymousClass0fD.A0A(253279404, A032);
                i2 = -1185066299;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1888745662);
                int A033 = AnonymousClass0fD.A03(-182654126);
                ((1P0) this.A01).onSuccess(obj);
                AnonymousClass0fD.A0A(-103867579, A033);
                i2 = 256475226;
                break;
            default:
                C8763R8o.super.onSuccess(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int i2;
        int i3;
        AnonymousClass3FZ A002;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1648281102);
                AnonymousClass3JC r12 = (AnonymousClass3JC) obj;
                int A0D = AnonymousClass7TG.A0D(r12, 675526429);
                AnonymousClass3FZ r7 = (AnonymousClass3FZ) r12.A01;
                String str = null;
                if (r7 != null) {
                    Class<QNZ> cls = QNZ.class;
                    if (!(r7.A00(cls, "ig_iab_autofill_save_data_entries") == null || (A002 = r7.A00(cls, "ig_iab_autofill_save_data_entries")) == null || A002.A05("ent_id") == null)) {
                        AnonymousClass3FZ A003 = r7.A00(cls, "ig_iab_autofill_save_data_entries");
                        if (A003 != null) {
                            str = A003.A05("ent_id");
                        }
                        AutofillData autofillData = (AutofillData) this.A01;
                        Map map = autofillData.A00;
                        if (str == null) {
                            map.remove(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        } else {
                            map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
                        }
                        if (this.A05) {
                            23d.A03(autofillData);
                        }
                        C10284Rpi rpi = (C10284Rpi) this.A02;
                        if (rpi != null) {
                            SB5.A00(new TDV(rpi.A00));
                        }
                        i3 = -1767522424;
                        AnonymousClass0fD.A0A(i3, A0D);
                        i2 = -912838550;
                        break;
                    }
                }
                0wb.A03("AutofillGraphQLRequest", "Error creating add-contact autofill response");
                C10284Rpi rpi2 = (C10284Rpi) this.A02;
                if (rpi2 != null) {
                    SB5.A00(new THQ(rpi2.A00, "Error creating add-contact autofill response"));
                }
                i3 = -728211864;
                AnonymousClass0fD.A0A(i3, A0D);
                i2 = -912838550;
            case 2:
                i = AnonymousClass0fD.A03(-510345780);
                int A032 = AnonymousClass0fD.A03(1902080534);
                User user = (User) this.A04;
                user.A16(this.A05);
                ((1Ng) this.A03).A00(new C2370736f(user, false, false, true, false));
                AnonymousClass0fD.A0A(67559718, A032);
                i2 = 1222424936;
                break;
            default:
                C8763R8o.super.onSuccessInBackground(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
