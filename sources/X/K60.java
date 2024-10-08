package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class K60 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "YourAIsFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final String A06 = "your_ais_fragment";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LRW lrw = (LRW) this.A00.getValue();
        Object value = this.A02.getValue();
        0qQ.A0B(value, 0);
        1Ln A002 = LRW.A00(lrw);
        if (DbT.A1Y(A002)) {
            A002.A0l("your_ais_screen_shown");
            A002.A0x(AnonymousClass7TF.A0w(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, value));
            LRW.A01(A002, lrw);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.K60 r5, com.instagram.common.session.UserSession r6, java.lang.String r7) {
        /*
            X.0eM r0 = r5.A00
            java.lang.Object r0 = r0.getValue()
            X.LRW r0 = (X.LRW) r0
            r0.A03(r7)
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            java.lang.String r4 = "utm_metadata"
            r0 = 33
            android.os.Bundle r2 = r5.mArguments
            if (r3 < r0) goto L_0x0051
            if (r2 == 0) goto L_0x0020
            java.lang.Class<com.instagram.aistudio.model.UtmMetadata> r0 = com.instagram.aistudio.model.UtmMetadata.class
            java.lang.Object r1 = r2.getParcelable(r4, r0)
        L_0x001e:
            com.instagram.aistudio.model.UtmMetadata r1 = (com.instagram.aistudio.model.UtmMetadata) r1
        L_0x0020:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "AiStudioArgumentKeys.creation_entry_point"
            r3.putString(r0, r7)
            r3.putParcelable(r4, r1)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r6)
            r0 = 36330204939305483(0x8112210006420b, double:3.038706121385471E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "AI_CREATION_CUSTOM_AI"
        L_0x0043:
            X.6W8 r0 = X.AnonymousClass6W8.A03(r1, r3, r6, r2, r0)
            r0.A08()
            X.DbT.A1M(r5, r0)
            return
        L_0x004e:
            java.lang.String r0 = "AI_CREATION_TEMPLATES"
            goto L_0x0043
        L_0x0051:
            if (r2 == 0) goto L_0x0020
            android.os.Parcelable r1 = r2.getParcelable(r4)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K60.A00(X.K60, com.instagram.common.session.UserSession, java.lang.String):void");
    }

    public final String getModuleName() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean onBackPressed() {
        LRW lrw = (LRW) this.A00.getValue();
        1Ln A002 = LRW.A00(lrw);
        if (!DbT.A1Y(A002)) {
            return false;
        }
        A002.A0l("your_ais_back_clicked");
        LRW.A01(A002, lrw);
        return false;
    }

    public K60() {
        MMK A002 = MMK.A00(this, 9);
        MMK A003 = MMK.A00(this, 6);
        0eO r3 = 0eO.A02;
        AnonymousClass0eM A004 = AnonymousClass0eN.A00(r3, MMK.A00(A003, 7));
        this.A05 = DbS.A0I(MMK.A00(A004, 8), A002, new MMZ(10, (Object) null, (Object) A004), DbS.A0z(C60129JgA.class));
        this.A04 = AnonymousClass0eN.A00(r3, new C51662FyO(this));
        this.A00 = AnonymousClass1YB.A00(MMK.A00(this, 4));
        this.A01 = AnonymousClass1YB.A00(MMK.A00(this, 5));
        this.A02 = C51975G9x.A0r(this, "your_ais_entry_point", r3, 17);
    }

    public final void configureActionBar(2da r4) {
        Dbb.A1I(r4);
        r4.Eom(2131976957);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_add_pano_outline_24;
        A0K.A05 = 2131956875;
        DbX.A19(new LYC((Object) this, 14), A0K, r4);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2125772851);
        K60.super.onCreate(bundle);
        JTO.A0U(this.A01).A06.markerStart(895690123);
        AnonymousClass0fD.A09(-494702032, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1676850123);
        ComposeView A0H = DbV.A0H(this, new C59111J6t(this, 10), -2047053145);
        AnonymousClass0fD.A09(1579512833, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1061648896);
        AnonymousClass7I6 A0U = JTO.A0U(this.A01);
        A0U.A06.markerEnd(895690123, JVT.A00(AnonymousClass05K.A0C));
        super.onDestroy();
        AnonymousClass0fD.A09(1430647016, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-225509806);
        super.onResume();
        2YL A0H = DbS.A0H(this.A05);
        MHA.A03(A0H, C318116oQ.A00(A0H), 20);
        AnonymousClass0fD.A09(1464543130, A022);
    }
}
