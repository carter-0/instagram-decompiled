package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.people.PeopleTag;
import com.instagram.tagging.model.Tag;
import java.util.ArrayList;

public abstract class K8A extends MYR implements AnonymousClass4DU, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "VideoMetadataInfoFragment";
    public FrameLayout A00;
    public C61520KAz A01;
    public boolean A02;
    public boolean A03 = true;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(C66306MMp.A02(this, 42));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(C66306MMp.A02(this, 43));
    public final AnonymousClass0eM A06 = C66306MMp.A00(this, C66306MMp.A02(this, 44), new C73666Phf(14, (Object) null, this), DbS.A0z(C60266JiN.class), 45);
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C60266JiN jiN = (C60266JiN) this.A06.getValue();
        if (this instanceof C61942KSr) {
            str = JTO.A0k(((C61942KSr) this).A0Y).A0B;
        } else {
            str = ((C61941KSq) this).A0G;
            if (str == null) {
                0qQ.A0F("composerSessionId");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        jiN.A02 = str;
        A0B(A0D());
    }

    public final C61520KAz A0C() {
        C61520KAz kAz = this.A01;
        if (kAz != null) {
            return kAz;
        }
        0qQ.A0F("enterPromoteFlowController");
        throw AnonymousClass00P.createAndThrow();
    }

    public ArrayList A0D() {
        String quantityString;
        C61941KSq kSq = (C61941KSq) this;
        1Xj r1 = kSq.A0C;
        String str = null;
        if (r1 != null) {
            ExtendedImageUrl A1n = r1.A1n(kSq.requireContext());
            ArrayList A1C = AnonymousClass7TE.A1C();
            A1C.add(new KGM((Uri) null, kSq, A1n, AnonymousClass05K.A01, kSq.A0F));
            String A0m = DbU.A0m(kSq, 2131969343);
            C65411Lsr lsr = new C65411Lsr(kSq);
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            A1C2.addAll(kSq.A0K);
            A1C2.addAll(kSq.A0J);
            Tag tag = (Tag) 00k.A0J(A1C2);
            String str2 = "";
            if (tag != null) {
                if (tag instanceof PeopleTag) {
                    str2 = ((PeopleTag) tag).A00.A04;
                } else if (tag instanceof FBUserTag) {
                    str2 = ((FBUserTag) tag).A02.A01;
                }
            }
            if (A1C2.isEmpty()) {
                quantityString = null;
            } else {
                quantityString = DbV.A05(kSq).getQuantityString(R.plurals.people_tagging_x_people_plurals, A1C2.size(), C51968G9o.A1Z(str2, A1C2.size()));
            }
            AnonymousClass0eM r4 = kSq.A0Y;
            A1C.add(new C64798LiI(AnonymousClass7TE.A0l(r4), lsr, A0m, quantityString));
            1Xj r0 = kSq.A0C;
            if (r0 != null) {
                if (!AnonymousClass7TF.A1Y(r0.A0C.CZZ(), true)) {
                    A1C.add(new Li8(kSq.A0E, kSq.A0L, kSq.A0U));
                }
                if (kSq.A03) {
                    if (kSq.A02) {
                        str = kSq.getString(2131964112);
                    } else {
                        AnonymousClass0eM r6 = kSq.A06;
                        if (JTT.A0W(r6).A03.length() > 0) {
                            str = kSq.getString(2131964109, C51968G9o.A1Z(JTT.A0W(r6).A03, JTT.A0W(r6).A00));
                        }
                    }
                    A1C.add(new C64782Lhy(DbU.A0m(kSq, 2131964093), str));
                }
                A1C.add(new C64797LiH(new C65369LsA(kSq, 29), 2131964090, kSq.A0P, true));
                1Xj r12 = kSq.A0C;
                if (r12 != null) {
                    if (r12.A6T(AnonymousClass7TE.A0l(r4))) {
                        1Xj r13 = kSq.A0C;
                        if (r13 != null) {
                            A1C.add(new C64765Lhh(r13.A27(AnonymousClass7TE.A0l(r4))));
                        }
                    }
                    return A1C;
                }
            }
        }
        0qQ.A0F("editMedia");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        if (X.AnonymousClass7TF.A1Y(r0.Aa6(), true) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0178, code lost:
        if (X.C51966G9m.A1a(r0.A3I(), r3.A0J) != false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E() {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C61942KSr
            if (r0 == 0) goto L_0x002a
            r5 = r8
            X.KSr r5 = (X.C61942KSr) r5
            boolean r4 = r5.A0M
            if (r4 == 0) goto L_0x0020
            X.0eM r0 = r5.A0Y
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = X.JTO.A0k(r0)
            X.LQk r0 = r0.A08
            X.KiE r3 = X.C62581KiE.READY_TO_PUBLISH
            com.instagram.igtv.uploadflow.common.IGTVUploadProgress r2 = r0.A01
            r1 = 5
            X.KiE r0 = r2.A00
            int r0 = r0.A00
            if (r1 <= r0) goto L_0x0020
            r2.A00 = r3
        L_0x0020:
            r5.A0L = r4
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x0029
            X.LJB.A00(r0, r4)
        L_0x0029:
            return
        L_0x002a:
            r3 = r8
            X.KSq r3 = (X.C61941KSq) r3
            r2 = 0
            r3.A0T = r2
            X.1Xj r0 = r3.A0C
            java.lang.String r7 = "editMedia"
            r5 = 0
            if (r0 == 0) goto L_0x0091
            X.3gp r0 = r0.A1T()
            if (r0 == 0) goto L_0x017f
            X.1Xj r0 = r3.A0C
            if (r0 == 0) goto L_0x0091
            X.3gp r0 = r0.A1T()
            if (r0 == 0) goto L_0x017c
            java.lang.String r4 = r0.A0d
        L_0x0049:
            X.1Xj r0 = r3.A0C
            if (r0 == 0) goto L_0x0091
            X.1Xy r0 = r0.A0C
            X.DTj r0 = r0.BFl()
            r6 = 1
            if (r0 == 0) goto L_0x006d
            X.1Xj r0 = r3.A0C
            if (r0 == 0) goto L_0x0091
            X.1Xy r0 = r0.A0C
            X.DTj r0 = r0.BFl()
            if (r0 == 0) goto L_0x006d
            java.lang.Boolean r0 = r0.Aa6()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r6)
            r1 = 1
            if (r0 != 0) goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            java.lang.String r0 = r3.A0F
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0088
            X.0eM r0 = r3.A06
            X.LMg r0 = X.JTT.A0W(r0)
            java.lang.String r0 = r0.A02
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0099
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0099
        L_0x0088:
            r2 = 1
        L_0x0089:
            r3.A0T = r2
            android.view.View r1 = r3.A03
            if (r1 != 0) goto L_0x0183
            java.lang.String r7 = "saveButton"
        L_0x0091:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0099:
            boolean r0 = r3.A0O
            if (r1 != r0) goto L_0x0088
            boolean r0 = r3.A0R
            if (r0 != 0) goto L_0x0088
            X.1Xj r0 = r3.A0C
            if (r0 == 0) goto L_0x0091
            boolean r1 = r0.A4c()
            boolean r0 = r3.A0P
            if (r1 != r0) goto L_0x0088
            X.1Xj r0 = r3.A0C
            if (r0 == 0) goto L_0x0091
            X.1Xy r0 = r0.A0C
            com.instagram.model.shopping.clips.IGTVShoppingInfoIntf r1 = r0.BFq()
            if (r1 == 0) goto L_0x0122
            com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata r4 = new com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata
            r4.<init>()
            com.instagram.user.model.User r0 = r1.BRo()
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
        L_0x00c8:
            X.0qQ.A0A(r0)
            X.0qQ.A0B(r0, r2)
            r4.A02 = r0
            com.instagram.user.model.ProductCollection r0 = r1.Aoo()
            if (r0 == 0) goto L_0x00da
            java.lang.String r5 = r0.Aoi()
        L_0x00da:
            r4.A01 = r5
            if (r5 != 0) goto L_0x011a
            java.util.List r0 = r1.Bga()
            if (r0 == 0) goto L_0x011a
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x011a
            java.util.List r1 = r1.Bga()
            if (r1 == 0) goto L_0x011a
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r1.iterator()
        L_0x00fc:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x011e
            java.lang.Object r1 = r2.next()
            com.instagram.user.model.ProductWrapperIntf r1 = (com.instagram.user.model.ProductWrapperIntf) r1
            com.instagram.user.model.ProductDetailsProductItemDictIntf r1 = r1.Bg5()
            if (r1 == 0) goto L_0x00fc
            java.lang.String r1 = r1.getProductId()
            if (r1 == 0) goto L_0x00fc
            r0.add(r1)
            goto L_0x00fc
        L_0x0118:
            r0 = r5
            goto L_0x00c8
        L_0x011a:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
        L_0x011e:
            r4.A03 = r0
            goto L_0x0088
        L_0x0122:
            java.util.List r5 = r3.A0M
            java.util.List r0 = r3.A0N
            boolean r4 = r3.A0V
            boolean r1 = r3.A0W
            X.0qQ.A0B(r5, r2)
            X.0qQ.A0B(r0, r6)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0088
            if (r4 != r1) goto L_0x0088
            X.1Xj r0 = r3.A0C
            if (r0 == 0) goto L_0x0091
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r1 = r0.BQ3()
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r0 = r3.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0088
            X.1Xj r0 = r3.A0C
            if (r0 == 0) goto L_0x0091
            com.instagram.model.venue.Venue r1 = r0.A23()
            com.instagram.model.venue.Venue r0 = r3.A0E
            boolean r0 = X.C51966G9m.A1a(r1, r0)
            if (r0 != 0) goto L_0x0088
            X.1Xj r0 = r3.A0C
            if (r0 == 0) goto L_0x0091
            java.util.ArrayList r1 = r0.A3E()
            java.util.ArrayList r0 = r3.A0K
            boolean r0 = X.C51966G9m.A1a(r1, r0)
            if (r0 != 0) goto L_0x0088
            X.1Xj r0 = r3.A0C
            if (r0 == 0) goto L_0x0091
            java.util.ArrayList r1 = r0.A3I()
            java.util.ArrayList r0 = r3.A0J
            boolean r0 = X.C51966G9m.A1a(r1, r0)
            if (r0 == 0) goto L_0x0089
            goto L_0x0088
        L_0x017c:
            r4 = r5
            goto L_0x0049
        L_0x017f:
            java.lang.String r4 = ""
            goto L_0x0049
        L_0x0183:
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r2 == 0) goto L_0x0189
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0189:
            r1.setAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K8A.A0E():void");
    }

    public final void A0F(String str) {
        if (this instanceof C61942KSr) {
            0qQ.A0B(str, 0);
            JTO.A0k(((C61942KSr) this).A0Y).ER5(str);
            return;
        }
        0qQ.A0B(str, 0);
        ((C61941KSq) this).A0F = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.0iw} */
    /* JADX WARNING: type inference failed for: r14v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r16v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r25v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r27v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r29v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection getDefinitions() {
        /*
            r30 = this;
            X.L1f r5 = new X.L1f
            r0 = r30
            r5.<init>(r0)
            android.content.Context r6 = r0.requireContext()
            X.0eM r12 = r0.A07
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r12)
            android.content.Context r4 = r0.requireContext()
            X.0gy r3 = X.AnonymousClass07i.A00(r0)
            r2 = 0
            X.2lw r1 = new X.2lw
            r1.<init>(r4, r3, r2)
            java.lang.String r11 = "igtv_edit_page"
            r7 = r0
            r8 = r1
            r10 = r2
            X.7eF r1 = X.C336207eF.A01(r6, r7, r8, r9, r10, r11)
            X.KFW r13 = new X.KFW
            r13.<init>(r1, r5)
            X.JYU r14 = new X.JYU
            r14.<init>()
            X.KEz r15 = new X.KEz
            r15.<init>()
            X.KF0 r16 = new X.KF0
            r16.<init>()
            X.L1g r1 = new X.L1g
            r1.<init>(r0)
            X.KFK r11 = new X.KFK
            r11.<init>(r1)
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.L1h r1 = new X.L1h
            r1.<init>(r0)
            X.KFY r10 = new X.KFY
            r10.<init>(r2, r1)
            X.L1i r1 = new X.L1i
            r1.<init>(r0)
            X.KFL r9 = new X.KFL
            r9.<init>(r1)
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.KAz r1 = r0.A0C()
            X.KFZ r7 = new X.KFZ
            r7.<init>(r2, r1)
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r12)
            X.KFa r6 = new X.KFa
            r6.<init>(r2, r1)
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r12)
            X.KFb r5 = new X.KFb
            r5.<init>(r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.KFM r4 = new X.KFM
            r4.<init>(r1)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r12)
            X.EG5 r3 = new X.EG5
            r3.<init>(r0, r1)
            X.KEs r25 = new X.KEs
            r25.<init>()
            X.0eM r1 = r0.A05
            java.lang.Object r8 = r1.getValue()
            X.2qT r8 = (X.C230882qT) r8
            X.0eM r1 = r0.A04
            java.lang.Object r1 = r1.getValue()
            X.2qi r1 = (X.C231002qi) r1
            X.KFV r2 = new X.KFV
            r2.<init>(r1, r8)
            X.KEv r27 = new X.KEv
            r27.<init>()
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r12)
            X.L1j r1 = new X.L1j
            r1.<init>(r0)
            X.KFc r0 = new X.KFc
            r0.<init>(r8, r1)
            X.KEy r29 = new X.KEy
            r29.<init>()
            r26 = r2
            r28 = r0
            r24 = r3
            r22 = r5
            r23 = r4
            r21 = r6
            r20 = r7
            r19 = r9
            r18 = r10
            r17 = r11
            X.2tE[] r0 = new X.C232222tE[]{r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            java.util.List r0 = X.0sr.A1P(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K8A.getDefinitions():java.util.Collection");
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(MPA.A00(this, 25));
    }

    public void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-182044251);
        K8A.super.onCreate(bundle);
        UserSession A0l = AnonymousClass7TE.A0l(this.A07);
        Context requireContext = requireContext();
        FragmentActivity requireActivity = requireActivity();
        if (this instanceof C61942KSr) {
            str = LJ9.A01((C61942KSr) this).A3t;
        } else {
            str = ((C61941KSq) this).A0I;
        }
        this.A01 = new C61520KAz(requireActivity, requireContext, A0l, this, new C63648L1k(this), str);
        registerLifecycleListener(A0C());
        ((2bu) this.A04.getValue()).Dh3();
        AnonymousClass0fD.A09(315578258, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1934477172);
        0qQ.A0B(layoutInflater, 0);
        registerLifecycleListener((C230882qT) this.A05.getValue());
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        AnonymousClass0fD.A09(-1396480639, A022);
        return onCreateView;
    }

    public void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-2097287965);
        super.onDestroy();
        unregisterLifecycleListener(A0C());
        AnonymousClass0fD.A09(-14508631, A022);
    }

    public void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1996878828);
        super.onDestroyView();
        unregisterLifecycleListener((C230882qT) this.A05.getValue());
        AnonymousClass0fD.A09(945681096, A022);
    }
}
