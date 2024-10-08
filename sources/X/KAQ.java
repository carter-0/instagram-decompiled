package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.util.Iterator;
import java.util.List;

public final class KAQ extends 1P0 {
    public final /* synthetic */ ClipsEditMetadataController A00;

    public KAQ(ClipsEditMetadataController clipsEditMetadataController) {
        this.A00 = clipsEditMetadataController;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r8) {
        /*
            r7 = this;
            r0 = -331327582(0xffffffffec4057a2, float:-9.301104E26)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r8, r5)
            instagram.features.clips.edit.ClipsEditMetadataController r4 = r7.A00
            boolean r0 = r4.A0c
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = X.C347037wA.A01(r8)
            X.4DH r0 = r4.A0q
            androidx.fragment.app.FragmentActivity r3 = r0.getActivity()
            r2 = r1
            if (r1 == 0) goto L_0x0024
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0035
        L_0x0024:
            if (r3 == 0) goto L_0x004d
            android.content.res.Resources r1 = r3.getResources()
            if (r1 == 0) goto L_0x004d
            r0 = 2131961521(0x7f1326b1, float:1.9559741E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x0033:
            if (r2 == 0) goto L_0x004a
        L_0x0035:
            int r0 = r2.length()
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "save_edits_failed_branded_content"
        L_0x003d:
            X.C59689JTv.A03(r3, r1, r0, r5)
        L_0x0040:
            instagram.features.clips.edit.ClipsEditMetadataController.A0G(r4, r5)
            r0 = 579081582(0x2284156e, float:3.580136E-18)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x004a:
            java.lang.String r0 = "save_edits_failed"
            goto L_0x003d
        L_0x004d:
            r1 = 0
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KAQ.onFail(X.4dm):void");
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-2033937221);
        ClipsEditMetadataController.A0G(this.A00, true);
        AnonymousClass0fD.A0A(1361615993, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = AnonymousClass0fD.A03(-313574138);
        C61290K1b k1b = (C61290K1b) obj;
        int A032 = AnonymousClass0fD.A03(-392557770);
        0qQ.A0B(k1b, 0);
        ClipsEditMetadataController clipsEditMetadataController = this.A00;
        ClipsEditMetadataController.A0G(clipsEditMetadataController, false);
        if (clipsEditMetadataController.A0H != null) {
            C310336ap A0W = DbV.A0W();
            Context context = clipsEditMetadataController.A0n;
            DbS.A19(context, A0W, 2131972154);
            A0W.A02();
            A0W.A07(R.drawable.instagram_info_pano_outline_24);
            A0W.A02 = context.getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
            if (clipsEditMetadataController.view != null) {
                clipsEditMetadataController.A0I().postDelayed(new M5W(A0W), 50);
            }
            1Xj r0 = clipsEditMetadataController.A0D;
            if (!(r0 == null || (str = r0.A0M) == null)) {
                JTP.A1S(str);
            }
        }
        UserSession userSession = clipsEditMetadataController.A0s;
        1E7.A00(userSession).A03(k1b.A00());
        clipsEditMetadataController.A0o.post(new M5V(clipsEditMetadataController));
        1Xj A002 = k1b.A00();
        C354958Oa A003 = AnonymousClass8OY.A00(userSession);
        String id = A002.getId();
        if (id != null) {
            0sn A004 = A003.A00(id);
            if (A004 == null) {
                A004 = 0sn.A00;
            }
            List A3Y = A002.A3Y();
            1as.A04.A0G(userSession, "CLIP", A3Y, A004);
            Iterator it = A3Y.iterator();
            while (it.hasNext()) {
                User A0k = DbT.A0k(it);
                if (AnonymousClass8OY.A01(userSession) || JTQ.A1T(A0k, A004)) {
                    1as.A04.A0A(userSession, A002, new DirectShareTarget(A0k));
                }
            }
            AnonymousClass0fD.A0A(-2138238740, A032);
            AnonymousClass0fD.A0A(-1123144063, A03);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
