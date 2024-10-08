package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class K4M extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AiSearchFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final String A07;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.K4M r7) {
        /*
            X.0eM r0 = r7.A00
            java.lang.Object r0 = r0.getValue()
            X.LRW r0 = (X.LRW) r0
            java.lang.String r6 = "ai_home_search"
            r0.A03(r6)
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            java.lang.String r3 = "utm_metadata"
            r0 = 33
            android.os.Bundle r2 = r7.mArguments
            if (r4 < r0) goto L_0x005d
            if (r2 == 0) goto L_0x0022
            java.lang.Class<com.instagram.aistudio.model.UtmMetadata> r0 = com.instagram.aistudio.model.UtmMetadata.class
            java.lang.Object r1 = r2.getParcelable(r3, r0)
        L_0x0020:
            com.instagram.aistudio.model.UtmMetadata r1 = (com.instagram.aistudio.model.UtmMetadata) r1
        L_0x0022:
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "AiStudioArgumentKeys.creation_entry_point"
            r5.putString(r0, r6)
            r5.putParcelable(r3, r1)
            X.0eM r4 = r7.A04
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36330204939305483(0x8112210006420b, double:3.038706121385471E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            X.0lg r3 = X.DbT.A0X(r4)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = "AI_CREATION_CUSTOM_AI"
        L_0x004f:
            X.6W8 r0 = X.AnonymousClass6W8.A03(r1, r5, r3, r2, r0)
            r0.A08()
            X.DbT.A1M(r7, r0)
            return
        L_0x005a:
            java.lang.String r0 = "AI_CREATION_TEMPLATES"
            goto L_0x004f
        L_0x005d:
            if (r2 == 0) goto L_0x0022
            android.os.Parcelable r1 = r2.getParcelable(r3)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K4M.A00(X.K4M):void");
    }

    public final String getModuleName() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public K4M() {
        0eO r3 = 0eO.A02;
        this.A02 = C51975G9x.A0r(this, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r3, 13);
        this.A03 = C51975G9x.A0r(this, "search_box_placeholder_text", r3, 14);
        this.A05 = AnonymousClass0eN.A00(r3, new C51661FyN(this));
        this.A07 = "search_fragment";
        MM7 mm7 = new MM7(this, 33);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new MM7(new MM7(this, 30), 31));
        this.A06 = DbS.A0I(new MM7(A002, 32), mm7, new MMZ(9, (Object) null, (Object) A002), DbS.A0z(C60234Jhr.class));
        this.A01 = AnonymousClass0eN.A01(new MM7(this, 29));
        this.A00 = MM7.A00(this, 28);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1098392490);
        ComposeView A0H = DbV.A0H(this, new C59111J6t(this, 9), -1982844107);
        AnonymousClass0fD.A09(-1742901644, A022);
        return A0H;
    }
}
