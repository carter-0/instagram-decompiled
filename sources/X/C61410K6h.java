package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.io.File;

/* renamed from: X.K6h  reason: case insensitive filesystem */
public final class C61410K6h extends AnonymousClass4DH implements AnonymousClass36P {
    public static final String __redex_internal_original_name = "PromoteMediaPickerIgMediaFragment";
    public C62474KgP A00;
    public LOA A01;
    public String A02;
    public C64515LdH A03;
    public C15695Uh1 A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final C2356130n A06 = new Object();

    public final /* synthetic */ void CJ6(Intent intent) {
    }

    public final /* synthetic */ void Ctk(int i, int i2) {
    }

    public final /* synthetic */ void Ctl(int i, int i2) {
    }

    public final void Ewk(File file, int i) {
        0qQ.A0B(file, 0);
        FFa.A02(requireActivity(), file, i);
    }

    public final void ExB(Intent intent, int i) {
        0qQ.A0B(intent, 0);
        0kR.A05(this, intent, i);
    }

    public final String getModuleName() {
        return "promote_ig_media_picker";
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: X.0iw} */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r1 == X.C62474KgP.A03) goto L_0x002b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            r19 = this;
            r3 = 0
            r4 = r20
            X.0qQ.A0B(r4, r3)
            r12 = r19
            r0 = r21
            super.onViewCreated(r4, r0)
            android.os.Bundle r1 = r12.requireArguments()
            java.lang.String r0 = "PromoteMediaPickerContentFragment.ARGUMENT_MEDIA_CONTENT_TYPE"
            java.io.Serializable r1 = r1.getSerializable(r0)
            if (r1 == 0) goto L_0x0174
            X.KgP r1 = (X.C62474KgP) r1
            r12.A00 = r1
            java.lang.String r11 = "mediaContentType"
            if (r1 == 0) goto L_0x0168
            X.KgP r0 = X.C62474KgP.STORY
            if (r1 == r0) goto L_0x002b
            X.KgP r0 = X.C62474KgP.REEL
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r1 != r0) goto L_0x002d
        L_0x002b:
            r5 = 1058013184(0x3f100000, float:0.5625)
        L_0x002d:
            r0 = 2131435923(0x7f0b2193, float:1.8493702E38)
            android.view.ViewStub r6 = X.JTR.A0X(r4, r0)
            X.0eM r2 = r12.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            X.Ldb r0 = new X.Ldb
            r0.<init>(r6, r12, r1, r5)
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r2)
            X.KgP r14 = r12.A00
            if (r14 == 0) goto L_0x0168
            X.LOA r15 = r12.A01
            java.lang.String r10 = "mediaPickerState"
            if (r15 == 0) goto L_0x0164
            X.LdI r13 = new X.LdI
            r17 = r12
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            r0 = 2131436026(0x7f0b21fa, float:1.849391E38)
            android.view.ViewStub r7 = X.JTR.A0X(r4, r0)
            r0 = 2131436025(0x7f0b21f9, float:1.8493909E38)
            android.view.View r6 = X.AnonymousClass7TF.A0F(r4, r0)
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            X.0lg r9 = X.AnonymousClass7TF.A0L(r2, r3)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36321353011307819(0x810a140000252b, double:3.033108126475895E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x00aa
            r0 = 2131436014(0x7f0b21ee, float:1.8493886E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r4, r0)
            r0 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r8, r0)
            r0 = 2131965951(0x7f1337ff, float:1.9568726E38)
            X.DbU.A1G(r1, r12, r0)
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r8, r0)
            r0 = 2131965962(0x7f13380a, float:1.9568749E38)
            X.DbU.A1G(r1, r12, r0)
            r1.setVisibility(r3)
            r0 = 2131434695(0x7f0b1cc7, float:1.8491211E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r8, r0)
            r0 = 31
            X.LY1.A00(r1, r0, r12)
            r8.setVisibility(r3)
        L_0x00aa:
            X.LE4 r8 = new X.LE4
            r8.<init>(r7, r6, r5)
            android.content.Context r5 = r12.requireContext()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            X.0gy r0 = X.AnonymousClass07i.A00(r12)
            X.6z9 r7 = new X.6z9
            r7.<init>(r5, r0, r1)
            X.KgP r0 = r12.A00
            if (r0 == 0) goto L_0x0168
            int r6 = r0.ordinal()
            r1 = 1
            java.lang.String r5 = "fullScreenPreviewController"
            if (r6 == r3) goto L_0x00df
            if (r6 == r1) goto L_0x00d7
            r0 = 2
            if (r6 == r0) goto L_0x00d7
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d7:
            X.Uh1 r0 = r12.A04
            if (r0 == 0) goto L_0x016c
            r0.A06(r3)
            goto L_0x00e6
        L_0x00df:
            X.Uh1 r0 = r12.A04
            if (r0 == 0) goto L_0x016c
            r0.A06(r1)
        L_0x00e6:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            X.Uh1 r0 = r12.A04
            if (r0 == 0) goto L_0x016c
            X.LrN r14 = new X.LrN
            r14.<init>(r8, r1, r7, r0)
            X.Kzq r15 = new X.Kzq
            r15.<init>(r4)
            androidx.fragment.app.FragmentActivity r11 = r12.requireActivity()
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r2)
            X.LOA r0 = r12.A01
            if (r0 == 0) goto L_0x0164
            java.lang.String r0 = r0.A03
            X.LdH r10 = new X.LdH
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r12.A03 = r10
            X.LdI r7 = r10.A02
            java.lang.Integer r0 = r7.A03
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            if (r0 == r8) goto L_0x0163
            java.util.List r0 = r7.A0A
            r0.clear()
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            java.util.Map r5 = r7.A0B
            java.util.Iterator r4 = X.DbV.A16(r5)
        L_0x0126:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0148
            java.lang.Object r2 = r4.next()
            java.lang.Object r0 = r5.get(r2)
            X.L3Q r0 = (X.L3Q) r0
            if (r0 == 0) goto L_0x0126
            java.util.Map r1 = r0.A01
            int r0 = r0.A00
            java.lang.Object r0 = X.C51968G9o.A10(r1, r0)
            if (r0 != 0) goto L_0x0144
            java.lang.String r0 = ""
        L_0x0144:
            r6.put(r2, r0)
            goto L_0x0126
        L_0x0148:
            r7.A06 = r6
            r7.A00 = r3
            r7.A03 = r8
            X.Ldb r0 = r7.A08
            X.2t9 r2 = r0.A04
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.DbS.A0R()
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r1.A01(r0)
            r2.A05(r1)
            X.C64516LdI.A01(r7)
        L_0x0163:
            return
        L_0x0164:
            X.0qQ.A0F(r10)
            goto L_0x016f
        L_0x0168:
            X.0qQ.A0F(r11)
            goto L_0x016f
        L_0x016c:
            X.0qQ.A0F(r5)
        L_0x016f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0174:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61410K6h.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null) {
            super.onActivityResult(i, i2, intent);
        }
        DbX.A0N(requireActivity(), this.A05).A06();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x001a: MOVE  (r3v1 X.K5x) = (r3v0 X.K5x)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = 706018282(0x2a14fbea, float:1.3232441E-13)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r6 = r13
            X.C61410K6h.super.onCreate(r14)
            android.app.Activity r0 = r13.getRootActivity()
            boolean r0 = r0 instanceof X.2Zg
            if (r0 == 0) goto L_0x0062
            androidx.fragment.app.Fragment r3 = r13.mParentFragment
            boolean r0 = r3 instanceof X.K5x
            r1 = 0
            if (r0 == 0) goto L_0x006c
            X.K5x r3 = (X.K5x) r3
            if (r3 == 0) goto L_0x006c
            X.LOA r0 = r3.A00()
            r13.A01 = r0
            r13.A02 = r1
            r1 = 0
            android.content.Context r5 = r13.requireContext()
            X.0eM r4 = r13.A05
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r4)
            X.0hq r7 = X.DbV.A0I(r13)
            r0 = 1
            X.LrP r11 = new X.LrP
            r11.<init>(r0)
            java.lang.String r0 = "promote_ig_media_picker"
            X.2kQ r10 = X.C227942kP.A01(r0, r1, r1)
            X.30n r9 = r13.A06
            X.0Pk r3 = X.0Pl.A0n
            android.content.Context r1 = r13.requireContext()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.0Pl r12 = r3.A00(r1, r0)
            X.Uh1 r4 = new X.Uh1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A04 = r4
            r13.registerLifecycleListener(r4)
            r0 = -1690523925(0xffffffff9b3ca6eb, float:-1.560493E-22)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x0062:
            java.lang.String r0 = "The root activity of PromoteMediaPickerIgMediaFragment should be SwipeNavigationHost (IgMainActivityLegacy)"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = 1818433523(0x6c6317f3, float:1.098157E27)
            goto L_0x0073
        L_0x006c:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1224959146(0x490364aa, float:538186.6)
        L_0x0073:
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61410K6h.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-433134816);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_ig_media_picker_content_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1532005481, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(173272043);
        super.onDestroy();
        C64515LdH ldH = this.A03;
        if (ldH != null) {
            ldH.destroy();
        }
        AnonymousClass0fD.A09(1478568353, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-443859769);
        C61410K6h.super.onPause();
        C64515LdH ldH = this.A03;
        if (ldH != null) {
            C65324LrN lrN = ldH.A03;
            lrN.A03 = false;
            C65324LrN.A03(lrN, "context_switch");
        }
        AnonymousClass0fD.A09(1156861395, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1818650351);
        super.onResume();
        LOA loa = this.A01;
        String str = "mediaPickerState";
        if (loa != null) {
            loa.A00();
            LOA loa2 = this.A01;
            if (loa2 != null) {
                loa2.A01 = this.A02;
                loa2.A00();
                LOA loa3 = this.A01;
                if (loa3 != null) {
                    C62474KgP kgP = this.A00;
                    if (kgP == null) {
                        str = "mediaContentType";
                    } else {
                        loa3.A00 = kgP;
                        C64515LdH ldH = this.A03;
                        if (ldH != null) {
                            C65324LrN lrN = ldH.A03;
                            lrN.A03 = true;
                            C65324LrN.A02(lrN);
                        }
                        AnonymousClass0fD.A09(-239917265, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
