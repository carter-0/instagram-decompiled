package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

public final class K4K extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "IGGenAISelfDisclosureBottomsheetFragment";
    public AnonymousClass9OT A00;
    public AnonymousClass8Cg A01;
    public String A02;
    public View A03;
    public MediaGenAIDetectionMethod A04;
    public IgdsSwitch A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new MMF(this, 47));
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final String getModuleName() {
        return "ig_genai_self_disclosure_bottom_sheet";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = this.A04;
        if (mediaGenAIDetectionMethod != null) {
            bundle.putString(AnonymousClass000.A00(1115), mediaGenAIDetectionMethod.toString());
        }
        AnonymousClass9OT r0 = this.A00;
        if (r0 != null) {
            bundle.putString(AnonymousClass000.A00(1114), r0.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r2 == com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            super.onViewCreated(r6, r7)
            android.view.View r2 = r5.A03
            java.lang.String r4 = "root"
            r1 = 0
            if (r2 == 0) goto L_0x00a7
            r0 = 2131441072(0x7f0b35b0, float:1.8504145E38)
            android.view.View r3 = r2.requireViewById(r0)
            boolean r0 = r3 instanceof com.instagram.igds.components.switchbutton.IgdsSwitch
            if (r0 == 0) goto L_0x00a4
            com.instagram.igds.components.switchbutton.IgdsSwitch r3 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r3
        L_0x001b:
            r5.A05 = r3
            if (r3 == 0) goto L_0x002c
            com.instagram.api.schemas.MediaGenAIDetectionMethod r2 = r5.A04
            if (r2 == 0) goto L_0x0028
            com.instagram.api.schemas.MediaGenAIDetectionMethod r1 = com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B
            r0 = 1
            if (r2 != r1) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r3.setChecked(r0)
        L_0x002c:
            com.instagram.igds.components.switchbutton.IgdsSwitch r2 = r5.A05
            if (r2 == 0) goto L_0x0039
            r1 = 39
            X.LsA r0 = new X.LsA
            r0.<init>(r5, r1)
            r2.A07 = r0
        L_0x0039:
            X.0eM r0 = r5.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.JUL.A01(r0)
            if (r0 == 0) goto L_0x0062
            android.view.View r1 = r5.A03
            if (r1 == 0) goto L_0x00a7
            r0 = 2131441071(0x7f0b35af, float:1.8504143E38)
            android.view.View r2 = r1.requireViewById(r0)
            boolean r0 = r2 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0062
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x0062
            android.content.Context r1 = r5.requireContext()
            r0 = 2131964570(0x7f13329a, float:1.9565925E38)
            X.DbT.A18(r1, r2, r0)
        L_0x0062:
            android.content.Context r1 = r5.requireContext()
            r0 = 2131964567(0x7f133297, float:1.956592E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r1, r0)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131964568(0x7f133298, float:1.9565921E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
            int r1 = X.Dbb.A04(r5)
            X.Kaz r0 = new X.Kaz
            r0.<init>((X.K4K) r5, (int) r1)
            android.text.SpannableStringBuilder r2 = X.DbS.A0C(r2)
            X.AnonymousClass7AV.A05(r2, r0, r3)
            android.view.View r1 = r5.A03
            if (r1 == 0) goto L_0x00a7
            r0 = 2131441070(0x7f0b35ae, float:1.8504141E38)
            android.view.View r1 = r1.requireViewById(r0)
            boolean r0 = r1 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x00a3
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x00a3
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r1.setText(r2, r0)
            X.DbT.A1H(r1)
        L_0x00a3:
            return
        L_0x00a4:
            r3 = r1
            goto L_0x001b
        L_0x00a7:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K4K.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1479205261);
        K4K.super.onCreate(bundle);
        String string = requireArguments().getString(AnonymousClass000.A00(1114));
        String string2 = requireArguments().getString(AnonymousClass000.A00(1115));
        String string3 = requireArguments().getString(AnonymousClass000.A00(2651));
        if (string != null) {
            this.A00 = AnonymousClass9OT.valueOf(string);
        }
        if (string2 != null) {
            this.A04 = C252913pu.A00(string2);
        }
        if (string3 != null) {
            this.A02 = string3;
        }
        AnonymousClass0fD.A09(-1552770757, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(910456481);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.genai_self_disclosure_bottom_sheet_layout, viewGroup, false);
        this.A03 = inflate;
        if (inflate == null) {
            0qQ.A0F("root");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(1272953988, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(367206672);
        super.onDestroyView();
        this.A05 = null;
        AnonymousClass0fD.A09(2113589165, A022);
    }
}
