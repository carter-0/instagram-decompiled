package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import org.webrtc.EglBase14Impl;

public final class H51 extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public H51(C267324bN r1, C52036GCi gCi, int i) {
        this.A00 = i;
        if (23 - i != 0) {
            this.A02 = gCi;
            this.A01 = r1;
        } else {
            this.A01 = r1;
            this.A02 = gCi;
        }
    }

    public static void A00(1OC r1, Object obj, Object obj2, int i) {
        r1.A00 = new H51(i, obj, obj2);
    }

    public final void onFail(C268654dm r5) {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(-207274949);
                ((C59608JQc) this.A01).DdR();
                i2 = -2095235032;
                break;
            case 3:
                i = AnonymousClass7TG.A0D(r5, -187661973);
                ((1P0) this.A01).onFail(r5);
                i2 = 2090252826;
                break;
            case 5:
                i = AnonymousClass0fD.A03(719545393);
                ((Dialog) this.A01).hide();
                C59689JTv.A0D(((C55922Hpj) this.A02).A00, C273654mx.A00(940));
                i2 = 1000100275;
                break;
            case 6:
                i = AnonymousClass0fD.A03(-1497773182);
                0qQ.A0B(r5, 0);
                H51.super.onFail(r5);
                ((1Xj) this.A01).A0C.EYH(false);
                i2 = -1275930493;
                break;
            case 7:
                i = AnonymousClass7TG.A0D(r5, -1412797472);
                H51.super.onFail(r5);
                i2 = -1495952000;
                break;
            case 8:
                i = AnonymousClass0fD.A03(-568486483);
                ViewGroup viewGroup = ((C357918a4) this.A01).A08;
                if (viewGroup != null) {
                    C59689JTv.A04(viewGroup.getContext());
                }
                i2 = 2026162688;
                break;
            case 9:
                i = AnonymousClass0fD.A03(-174002931);
                H51.super.onFail(r5);
                C56631I5k.A04((C54063Gym) r5.A00(), ((C283155Gi) this.A02).A04.A0b);
                i2 = -1968511098;
                break;
            case 10:
                i = AnonymousClass0fD.A03(1364184085);
                C278754xT r2 = (C278754xT) this.A02;
                r2.A05.remove(C3727792j.GRAPHQL_PROFILE_FEED);
                C278754xT.A02((AnonymousClass540) this.A01, r2);
                i2 = -875252569;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = AnonymousClass0fD.A03(-1362706396);
                ((1P0) this.A01).onFail(r5);
                i2 = 606553305;
                break;
            case 13:
                i = AnonymousClass0fD.A03(-1202702690);
                H24.A00((H24) this.A02);
                i2 = 1692236619;
                break;
            case 14:
                i = AnonymousClass0fD.A03(1874397776);
                H25 h25 = (H25) this.A01;
                C51975G9x.A17(h25, false);
                h25.A01.setEnabled(true);
                C59689JTv.A0C(h25.getContext(), "create_collection_failed");
                i2 = -639665300;
                break;
            case 15:
                i = AnonymousClass0fD.A03(-1689675144);
                H10.A02((H10) this.A02);
                i2 = 893416298;
                break;
            case 16:
                i = AnonymousClass0fD.A03(-1446794767);
                H10.A02((H10) this.A02);
                i2 = -1314646021;
                break;
            case 17:
                i = AnonymousClass0fD.A03(-1266163440);
                H15 h15 = (H15) this.A01;
                H15.A01(h15);
                EmptyStateView emptyStateView = h15.A0I;
                if (emptyStateView != null) {
                    emptyStateView.A0L();
                    h15.A0I.setVisibility(8);
                }
                i2 = 1535757060;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = AnonymousClass0fD.A03(216619821);
                DbS.A1U(this.A01);
                i2 = -320072974;
                break;
            case 19:
                i = AnonymousClass0fD.A03(1119749851);
                DbS.A1U(this.A01);
                i2 = -1000825812;
                break;
            case 21:
                i = AnonymousClass7TG.A0D(r5, -1178081552);
                H51.super.onFail(r5);
                i2 = 2018596917;
                break;
            case 23:
                i = AnonymousClass0fD.A03(-238023534);
                SQH.A00(((C52036GCi) this.A02).A00);
                i2 = 1727186320;
                break;
            case 24:
                i = AnonymousClass0fD.A03(-1960342279);
                SQH.A00(((C52036GCi) this.A02).A00);
                i2 = -649329218;
                break;
            case 25:
                i = AnonymousClass0fD.A03(-1186056491);
                SQH.A00(((C52036GCi) this.A02).A00);
                i2 = -1084877059;
                break;
            case 26:
                i = AnonymousClass0fD.A03(-273537191);
                SQH.A00(((C52036GCi) this.A02).A00);
                i2 = -1037290767;
                break;
            case 27:
                i = AnonymousClass0fD.A03(666026018);
                C59689JTv.A0A((Context) this.A01, "clips_restore_original_audio_failed");
                i2 = 1016360868;
                break;
            default:
                H51.super.onFail(r5);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFailInBackground(C268654dm r8) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1428177023);
                C18734VzD vzD = (C18734VzD) this.A02;
                C18734VzD vzD2 = C18734VzD.A04;
                ConcurrentMap concurrentMap = vzD.A03;
                C17918Vi9 vi9 = (C17918Vi9) this.A01;
                concurrentMap.remove(vi9.A04);
                List<Reference> list = vi9.A06;
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Reference reference : list) {
                    Object obj = reference.get();
                    if (obj != null) {
                        A1C.add(obj);
                    }
                }
                Iterator it = A1C.iterator();
                while (it.hasNext()) {
                    C57813Igs igs = new C57813Igs((C15295Ua1) it.next(), vi9);
                    if (0qQ.A0K(Looper.getMainLooper(), Looper.myLooper())) {
                        igs.run();
                    } else {
                        vzD.A00.post(igs);
                    }
                }
                i2 = -1909661688;
                break;
            case 3:
                i = AnonymousClass7TG.A0D(r8, -1667822635);
                ((1P0) this.A01).onFailInBackground(r8);
                i2 = -201617207;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = AnonymousClass0fD.A03(100146174);
                ((1P0) this.A01).onFailInBackground(r8);
                i2 = 1005496492;
                break;
            default:
                H51.super.onFailInBackground(r8);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 3:
                i = AnonymousClass0fD.A03(480889364);
                ((1P0) this.A01).onFinish();
                i2 = -275118677;
                break;
            case 8:
                i = AnonymousClass0fD.A03(2135511281);
                ((Dialog) this.A02).dismiss();
                i2 = -129958232;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = AnonymousClass0fD.A03(1201614992);
                ((1P0) this.A01).onFinish();
                i2 = 223230518;
                break;
            case 15:
                i = AnonymousClass0fD.A03(-441053288);
                ((H10) this.A02).A06 = false;
                i2 = -2063148205;
                break;
            case 16:
                i = AnonymousClass0fD.A03(-2131417662);
                ((H10) this.A02).A06 = false;
                i2 = 682350265;
                break;
            case 17:
                i = AnonymousClass0fD.A03(-298089666);
                ((H15) this.A01).A0S = false;
                i2 = 1123446184;
                break;
            default:
                H51.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 3:
                i = AnonymousClass0fD.A03(-208855555);
                ((1P0) this.A01).onStart();
                i2 = 1367484129;
                break;
            case 7:
                i = AnonymousClass0fD.A03(-1081281600);
                H51.super.onStart();
                i2 = 1324508198;
                break;
            case 8:
                i = AnonymousClass0fD.A03(899329780);
                AnonymousClass0fN.A00((Dialog) this.A02);
                i2 = 1908066527;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = AnonymousClass0fD.A03(-595269125);
                ((1P0) this.A01).onStart();
                i2 = -1316480421;
                break;
            case 15:
                i = AnonymousClass0fD.A03(2009563659);
                H10.A01((H10) this.A02);
                i2 = 1657874798;
                break;
            case 16:
                i = AnonymousClass0fD.A03(710797841);
                H10.A01((H10) this.A02);
                i2 = -2070497049;
                break;
            case 17:
                i = AnonymousClass0fD.A03(912518593);
                H15 h15 = (H15) this.A01;
                h15.A0S = true;
                EmptyStateView emptyStateView = h15.A0I;
                if (emptyStateView != null) {
                    emptyStateView.setVisibility(0);
                    h15.A0I.A0L();
                }
                i2 = -876459812;
                break;
            case 20:
                i = AnonymousClass0fD.A03(-250201865);
                H51.super.onStart();
                C638918c.A01(C61170le.A00).A0G();
                i2 = 195064937;
                break;
            case 21:
                i = AnonymousClass0fD.A03(1236109617);
                H51.super.onStart();
                i2 = -1827508176;
                break;
            default:
                H51.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x061b, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0622, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0649, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x064c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03ba, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03bd, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x038d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 1: goto L_0x0605;
                case 2: goto L_0x05e4;
                case 3: goto L_0x059c;
                case 4: goto L_0x0569;
                case 5: goto L_0x053d;
                case 6: goto L_0x0517;
                case 7: goto L_0x04ea;
                case 8: goto L_0x04bf;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0478;
                case 13: goto L_0x0432;
                case 14: goto L_0x03fb;
                case 15: goto L_0x03be;
                case 16: goto L_0x032d;
                case 17: goto L_0x02f0;
                case 18: goto L_0x02d2;
                case 19: goto L_0x02b4;
                case 20: goto L_0x0267;
                case 21: goto L_0x0220;
                case 22: goto L_0x01b9;
                case 23: goto L_0x0146;
                case 24: goto L_0x0107;
                case 25: goto L_0x00d0;
                case 26: goto L_0x0099;
                case 27: goto L_0x0061;
                case 28: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.H51.super.onSuccess(r14)
            return
        L_0x0009:
            r0 = 1255052429(0x4ace948d, float:6769222.5)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.1XO r14 = (X.1XO) r14
            r1 = 314906095(0x12c515ef, float:1.2437855E-27)
            int r5 = X.AnonymousClass7TG.A0D(r14, r1)
            java.util.List r1 = r14.A06
            X.0qQ.A07(r1)
            java.lang.Object r2 = X.00k.A0J(r1)
            X.1Xj r2 = (X.1Xj) r2
            if (r2 == 0) goto L_0x0056
            java.lang.Object r4 = r13.A02
            X.HKc r4 = (X.C54593HKc) r4
            java.lang.Object r3 = r13.A01
            X.H3S r3 = (X.H3S) r3
            X.3gp r1 = r2.A1V()
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r1.A0d
            if (r1 == 0) goto L_0x003a
            r3.A02 = r1
        L_0x003a:
            com.instagram.common.typedurl.ImageUrl r1 = r2.A1Q()
            if (r1 == 0) goto L_0x0042
            r3.A01 = r1
        L_0x0042:
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.session.UserSession r1 = r4.A07
            X.C51967G9n.A1K(r1, r2)
            java.lang.String r2 = r3.A04
            java.lang.String r1 = r4.A00
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0056
            X.C54593HKc.A00(r3, r4)
        L_0x0056:
            r1 = 2022976827(0x78942d3b, float:2.404304E34)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 1706272270(0x65b3a60e, float:1.0604585E23)
            goto L_0x0649
        L_0x0061:
            r0 = 903448273(0x35d986d1, float:1.6206997E-6)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Gye r14 = (X.C54055Gye) r14
            r0 = 592114190(0x234af20e, float:1.1001699E-17)
            int r5 = X.AnonymousClass7TG.A0D(r14, r0)
            java.lang.Object r3 = r13.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r13.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.4sL r0 = r14.A00
            if (r0 == 0) goto L_0x0095
            X.1Xj r1 = r0.A00
            r0 = 2131972027(0x7f134fbb, float:1.958105E38)
            X.C59689JTv.A07(r3, r0)
            if (r1 == 0) goto L_0x008a
            X.C51967G9n.A1K(r2, r1)
        L_0x008a:
            r0 = 1633966525(0x616459bd, float:2.6327025E20)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -466926764(0xffffffffe42b4354, float:-1.2636979E22)
            goto L_0x03ba
        L_0x0095:
            java.lang.String r9 = "clipsItem"
            goto L_0x061b
        L_0x0099:
            r0 = 78509588(0x4adf614, float:4.089809E-36)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -1223422344(0xffffffffb7140e78, float:-8.824856E-6)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r2 = r13.A01
            X.1Xj r2 = (X.1Xj) r2
            r1 = 1
            X.1Xy r2 = r2.A0C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.Efg(r1)
            java.lang.Object r1 = r13.A02
            X.GCi r1 = (X.C52036GCi) r1
            X.4DH r1 = r1.A01
            android.content.Context r2 = r1.getContext()
            r1 = 2131956086(0x7f131176, float:1.9548718E38)
            X.C59689JTv.A07(r2, r1)
            r1 = 1257284597(0x4af0a3f5, float:7885306.5)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -858422873(0xffffffffccd581a7, float:-1.11938872E8)
            goto L_0x0649
        L_0x00d0:
            r0 = -1440967620(0xffffffffaa1c943c, float:-1.3907012E-13)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -1285210497(0xffffffffb3653e7f, float:-5.3375057E-8)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r2 = r13.A01
            X.1Xj r2 = (X.1Xj) r2
            r1 = 0
            X.1Xy r2 = r2.A0C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.Efg(r1)
            java.lang.Object r1 = r13.A02
            X.GCi r1 = (X.C52036GCi) r1
            X.4DH r1 = r1.A01
            android.content.Context r2 = r1.getContext()
            r1 = 2131956081(0x7f131171, float:1.9548708E38)
            X.C59689JTv.A07(r2, r1)
            r1 = 565731423(0x21b8605f, float:1.2493834E-18)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 313490414(0x12af7bee, float:1.1074604E-27)
            goto L_0x0649
        L_0x0107:
            r0 = -1444279520(0xffffffffa9ea0b20, float:-1.03936174E-13)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 985318610(0x3abac4d2, float:0.0014249331)
            int r6 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r5 = r13.A02
            X.GCi r5 = (X.C52036GCi) r5
            X.GBg r4 = r5.A04
            java.lang.Object r3 = r13.A01
            X.4bN r3 = (X.C267324bN) r3
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r1 = r5.A02
            com.instagram.user.model.User r2 = r2.A01(r1)
            com.instagram.model.people.PeopleTag r1 = new com.instagram.model.people.PeopleTag
            r1.<init>((com.instagram.user.model.User) r2)
            r4.A0S(r3, r1)
            X.4DH r1 = r5.A01
            android.content.Context r2 = r1.getContext()
            r1 = 2131956085(0x7f131175, float:1.9548716E38)
            X.C59689JTv.A07(r2, r1)
            r1 = -298432708(0xffffffffee36473c, float:-1.4103097E28)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 2024706521(0x78ae91d9, float:2.8325556E34)
            goto L_0x0649
        L_0x0146:
            r0 = -1019719796(0xffffffffc3384f8c, float:-184.31073)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 2035158331(0x794e0d3b, float:6.6867594E34)
            int r5 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r6 = r13.A01
            X.4bN r6 = (X.C267324bN) r6
            X.1Xj r3 = r6.A02
            if (r3 == 0) goto L_0x0191
            X.0eE r2 = X.AnonymousClass0t1.A01
            java.lang.Object r1 = r13.A02
            X.GCi r1 = (X.C52036GCi) r1
            com.instagram.common.session.UserSession r1 = r1.A02
            com.instagram.user.model.User r2 = r2.A01(r1)
            X.1sQ r1 = X.C51966G9m.A0n(r3)
            if (r1 == 0) goto L_0x0191
            com.instagram.model.shopping.clips.ClipsShoppingInfoIntf r1 = r1.Btl()
            if (r1 == 0) goto L_0x0191
            java.util.List r1 = r1.Bga()
            if (r1 == 0) goto L_0x0191
            java.util.Iterator r4 = r1.iterator()
            if (r4 == 0) goto L_0x0191
            r1 = 24
            X.Wyw r3 = new X.Wyw
            r3.<init>(r2, r1)
            r2 = 12
            X.AWR r1 = new X.AWR
            r1.<init>(r3, r2)
            X.C11307SKv.A01(r1, r4)
        L_0x0191:
            X.1Xj r2 = r6.A02
            if (r2 == 0) goto L_0x019e
            java.lang.Object r1 = r13.A02
            X.GCi r1 = (X.C52036GCi) r1
            com.instagram.common.session.UserSession r1 = r1.A02
            r2.AE7(r1)
        L_0x019e:
            java.lang.Object r1 = r13.A02
            X.GCi r1 = (X.C52036GCi) r1
            X.4DH r1 = r1.A01
            android.content.Context r2 = r1.getContext()
            r1 = 2131971985(0x7f134f91, float:1.9580965E38)
            X.C59689JTv.A07(r2, r1)
            r1 = 436276132(0x1a010ba4, float:2.6685978E-23)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 2101606796(0x7d43f98c, float:1.6280949E37)
            goto L_0x0649
        L_0x01b9:
            r0 = -1719709724(0xffffffff997f4fe4, float:-1.3199325E-23)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.371 r14 = (X.AnonymousClass371) r14
            r1 = -1278734937(0xffffffffb3c80da7, float:-9.315709E-8)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r6 = 0
            X.0qQ.A0B(r14, r6)
            java.lang.Object r1 = r14.FH3()
            X.Gl0 r1 = (X.C53252Gl0) r1
            java.util.List r7 = r1.A00
            java.lang.Object r1 = r13.A02
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r1.iterator()
        L_0x01e1:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x01fc
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.4bN r1 = (X.C267324bN) r1
            java.lang.String r1 = r1.getId()
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x01e1
            r4.add(r2)
            goto L_0x01e1
        L_0x01fc:
            java.lang.Object r3 = r13.A01
            X.GBE r3 = (X.GBE) r3
            java.util.Iterator r2 = r4.iterator()
        L_0x0204:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0215
            X.4bN r1 = X.C51966G9m.A0m(r2)
            X.0qQ.A0B(r1, r6)
            X.GBE.A02(r1, r3)
            goto L_0x0204
        L_0x0215:
            r1 = -1990801830(0xffffffff8956c65a, float:-2.5852577E-33)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 1281834875(0x4c673f7b, float:6.0620268E7)
            goto L_0x0649
        L_0x0220:
            r0 = 1819442879(0x6c727ebf, float:1.17263436E27)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Gyf r14 = (X.C54056Gyf) r14
            r1 = 547787937(0x20a694a1, float:2.8219848E-19)
            int r5 = X.AnonymousClass7TG.A0D(r14, r1)
            java.util.List r3 = r14.A00
            if (r3 == 0) goto L_0x0257
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0257
            java.lang.Object r1 = r13.A02
            X.Gh3 r1 = (X.C53012Gh3) r1
            X.05G r4 = r1.A01
            java.lang.Object r1 = r13.A01
            com.instagram.api.schemas.AudioFilterType r1 = (com.instagram.api.schemas.AudioFilterType) r1
            X.GlA r2 = new X.GlA
            r2.<init>(r1, r3)
        L_0x0249:
            r4.Epw(r2)
            r1 = 364896721(0x15bfe1d1, float:7.750056E-26)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 454537379(0x1b17b0a3, float:1.2547502E-22)
            goto L_0x0649
        L_0x0257:
            java.lang.Object r1 = r13.A02
            X.Gh3 r1 = (X.C53012Gh3) r1
            X.05G r4 = r1.A01
            com.instagram.api.schemas.AudioFilterType r3 = com.instagram.api.schemas.AudioFilterType.UNRECOGNIZED
            X.0sn r1 = X.0sn.A00
            X.GlA r2 = new X.GlA
            r2.<init>(r3, r1)
            goto L_0x0249
        L_0x0267:
            r0 = -1180480428(0xffffffffb9a34c54, float:-3.1146652E-4)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3HO r14 = (X.AnonymousClass3HO) r14
            r1 = 2031585874(0x79178a52, float:4.9177643E34)
            int r2 = X.AnonymousClass7TG.A0D(r14, r1)
            X.H51.super.onSuccess(r14)
            X.3Ia r3 = r14.FH3()
            java.lang.Object r1 = r13.A02
            X.1KS r1 = (X.1KS) r1
            com.instagram.common.session.UserSession r1 = r1.A03
            X.1E4.A00(r1)
            com.instagram.reels.store.ReelStore r4 = X.1OP.A05(r1)
            java.lang.Object r6 = r13.A01
            X.1OE r6 = (X.1OE) r6
            java.util.List r8 = X.AnonymousClass3P8.A01(r1, r3)
            java.util.List r9 = X.AnonymousClass3P8.A00(r1, r3)
            X.3HX r5 = r3.A04
            com.instagram.user.model.User r7 = X.DbT.A0j(r1)
            boolean r11 = r14.CPt()
            boolean r12 = X.AnonymousClass3P8.A02(r3)
            r10 = -1
            r4.A0Z(r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 1966945197(0x753d33ad, float:2.3984185E32)
            X.AnonymousClass0fD.A0A(r1, r2)
            r1 = -1088332637(0xffffffffbf215ca3, float:-0.6303198)
            goto L_0x0649
        L_0x02b4:
            r0 = 502103049(0x1ded7c09, float:6.2861627E-21)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -1801535524(0xffffffff949ebfdc, float:-1.6029598E-26)
            int r2 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r13.A02
            X.DbS.A1U(r1)
            r1 = 960177352(0x393b24c8, float:1.7847412E-4)
            X.AnonymousClass0fD.A0A(r1, r2)
            r1 = 1934905840(0x735451f0, float:1.6821729E31)
            goto L_0x0649
        L_0x02d2:
            r0 = 1108777229(0x4216990d, float:37.649464)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 2122994248(0x7e8a5248, float:9.193035E37)
            int r2 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r13.A02
            X.DbS.A1U(r1)
            r1 = 1887071899(0x707a6e9b, float:3.1001987E29)
            X.AnonymousClass0fD.A0A(r1, r2)
            r1 = 140912863(0x86628df, float:6.926115E-34)
            goto L_0x0649
        L_0x02f0:
            r0 = -64942873(0xfffffffffc210ce7, float:-3.344886E36)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -138299636(0xfffffffff7c1b70c, float:-7.858015E33)
            int r6 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r5 = r13.A01
            X.H15 r5 = (X.H15) r5
            com.instagram.save.model.SavedCollection r4 = r5.A0C
            if (r4 != 0) goto L_0x0311
            r1 = 2132065121(0x7f14bb61, float:1.9769867E38)
        L_0x0309:
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 2075392147(0x7bb3f893, float:1.8689256E36)
            goto L_0x0649
        L_0x0311:
            java.lang.Object r3 = r13.A02
            X.1Ng r3 = (X.1Ng) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.INs r1 = new X.INs
            r1.<init>(r4, r2)
            r3.A00(r1)
            android.os.Handler r2 = r5.A0c
            X.Ifw r1 = new X.Ifw
            r1.<init>(r13)
            r2.post(r1)
            r1 = -1294857951(0xffffffffb2d20921, float:-2.4451369E-8)
            goto L_0x0309
        L_0x032d:
            r0 = -1070641726(0xffffffffc02f4dc2, float:-2.739121)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -1535922251(0xffffffffa473afb5, float:-5.2841055E-17)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r6 = r13.A02
            X.H10 r6 = (X.H10) r6
            com.instagram.save.model.SavedCollection r8 = r6.A02
            java.lang.String r9 = "collection"
            if (r8 == 0) goto L_0x061b
            android.widget.EditText r0 = r6.A00
            if (r0 != 0) goto L_0x034d
            java.lang.String r9 = "collectionName"
            goto L_0x061b
        L_0x034d:
            java.lang.String r7 = X.AnonymousClass7TF.A0f(r0)
            int r3 = r7.length()
            r0 = 1
            int r3 = r3 - r0
            r2 = 0
            r1 = 0
        L_0x0359:
            if (r2 > r3) goto L_0x0371
            r0 = r3
            if (r1 != 0) goto L_0x035f
            r0 = r2
        L_0x035f:
            boolean r0 = X.Dbc.A13(r7, r0)
            if (r1 != 0) goto L_0x036c
            if (r0 != 0) goto L_0x0369
            r1 = 1
            goto L_0x0359
        L_0x0369:
            int r2 = r2 + 1
            goto L_0x0359
        L_0x036c:
            if (r0 == 0) goto L_0x0371
            int r3 = r3 + -1
            goto L_0x0359
        L_0x0371:
            java.lang.String r0 = X.Dba.A0c(r7, r3, r2)
            r8.A0G = r0
            java.lang.String r0 = r6.A03
            if (r0 == 0) goto L_0x0395
            X.0eM r0 = r6.A0H
            X.1E8 r1 = X.DbX.A0d(r0)
            java.lang.String r0 = r6.A03
            X.1Xj r2 = r1.A02(r0)
            if (r2 == 0) goto L_0x0395
            com.instagram.save.model.SavedCollection r1 = r6.A02
            if (r1 == 0) goto L_0x061b
            java.lang.String r0 = r2.getId()
            r1.A0H = r0
            r1.A04 = r2
        L_0x0395:
            java.lang.Object r3 = r13.A01
            X.1Ng r3 = (X.1Ng) r3
            com.instagram.save.model.SavedCollection r2 = r6.A02
            if (r2 == 0) goto L_0x061b
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.INs r0 = new X.INs
            r0.<init>(r2, r1)
            r3.A00(r0)
            android.os.Handler r1 = r6.A0G
            X.Ifn r0 = new X.Ifn
            r0.<init>(r6)
            r1.post(r0)
            r0 = -10865889(0xffffffffff5a331f, float:-2.9003714E38)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -538343360(0xffffffffdfe98840, float:-3.365554E19)
        L_0x03ba:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x03be:
            r0 = 246760011(0xeb5424b, float:4.4683783E-30)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 288723551(0x1135925f, float:1.4323486E-28)
            int r6 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r5 = r13.A01
            X.1Ng r5 = (X.1Ng) r5
            java.lang.Object r4 = r13.A02
            X.H10 r4 = (X.H10) r4
            com.instagram.save.model.SavedCollection r3 = r4.A02
            if (r3 != 0) goto L_0x03dc
            java.lang.String r9 = "collection"
            goto L_0x061b
        L_0x03dc:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.INs r1 = new X.INs
            r1.<init>(r3, r2)
            r5.A00(r1)
            android.os.Handler r2 = r4.A0G
            X.Ifm r1 = new X.Ifm
            r1.<init>(r4)
            r2.post(r1)
            r1 = 1235977904(0x49ab86b0, float:1405142.0)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -1631232371(0xffffffff9ec55e8d, float:-2.0897292E-20)
            goto L_0x0649
        L_0x03fb:
            r0 = 875658025(0x34317b29, float:1.6529215E-7)
            int r0 = X.AnonymousClass0fD.A03(r0)
            com.instagram.save.model.SavedCollection r14 = (com.instagram.save.model.SavedCollection) r14
            r1 = -569010971(0xffffffffde1594e5, float:-2.6946229E18)
            int r5 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r13.A02
            X.1Ng r1 = (X.1Ng) r1
            X.C57078INs.A00(r1, r14)
            java.lang.Object r4 = r13.A01
            X.H25 r4 = (X.H25) r4
            com.instagram.common.session.UserSession r3 = r4.getSession()
            int r2 = r4.A00
            r1 = 0
            X.I6U.A03(r4, r3, r14, r1, r2)
            r1 = 0
            X.C51975G9x.A17(r4, r1)
            X.DbX.A1I(r4)
            r1 = 184448925(0xafe779d, float:2.4504304E-32)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -803735996(0xffffffffd017f644, float:-1.01979955E10)
            goto L_0x0649
        L_0x0432:
            r0 = -1702361932(0xffffffff9a8804b4, float:-5.625588E-23)
            int r0 = X.AnonymousClass0fD.A03(r0)
            com.instagram.save.model.SavedCollection r14 = (com.instagram.save.model.SavedCollection) r14
            r1 = -1132219533(0xffffffffbc83b373, float:-0.016076779)
            int r6 = X.AnonymousClass0fD.A03(r1)
            r5 = 0
            X.0qQ.A0B(r14, r5)
            java.lang.Object r1 = r13.A01
            X.1Ng r1 = (X.1Ng) r1
            X.C57078INs.A00(r1, r14)
            java.lang.Object r4 = r13.A02
            X.H24 r4 = (X.H24) r4
            com.instagram.common.session.UserSession r3 = r4.getSession()
            int r2 = r4.A00
            r1 = 0
            X.I6U.A03(r4, r3, r14, r1, r2)
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            if (r2 == 0) goto L_0x046d
            X.2dY r1 = X.2dZ.A0t
            X.2dZ r1 = r1.A03(r2)
            r1.setIsLoading(r5)
            r2.onBackPressed()
        L_0x046d:
            r1 = 1065252986(0x3f7e787a, float:0.9940258)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -1211488897(0xffffffffb7ca257f, float:-2.4097737E-5)
            goto L_0x0649
        L_0x0478:
            r0 = 877872354(0x345344e2, float:1.9675966E-7)
            int r0 = X.AnonymousClass0fD.A03(r0)
            com.instagram.save.model.SavedCollection r14 = (com.instagram.save.model.SavedCollection) r14
            r1 = -1905760978(0xffffffff8e68652e, float:-2.8644924E-30)
            int r5 = X.AnonymousClass0fD.A03(r1)
            com.instagram.save.model.CollaborativeCollectionMetadata r1 = r14.A05
            boolean r4 = X.AnonymousClass7TF.A1V(r1)
            java.lang.Object r3 = r13.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            com.instagram.user.model.User r2 = X.DbT.A0j(r3)
            r1 = 1
            X.4Cl r2 = r2.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            if (r4 == 0) goto L_0x04bb
            r2.EY4(r1)
        L_0x04a2:
            java.lang.Object r1 = r13.A01
            X.1P0 r1 = (X.1P0) r1
            r1.onSuccess(r14)
            X.IOk r1 = X.C55124HcX.A00(r3)
            r1.A04(r14)
            r1 = 754144575(0x2cf3553f, float:6.9159396E-12)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 1833535552(0x6d498840, float:3.8982002E27)
            goto L_0x0649
        L_0x04bb:
            r2.EYh(r1)
            goto L_0x04a2
        L_0x04bf:
            r0 = 1748280068(0x6834a304, float:3.4121323E24)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 400751517(0x17e2fb9d, float:1.4668424E-24)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r13.A01
            X.8a4 r1 = (X.C357918a4) r1
            r2 = 2131967862(0x7f133f76, float:1.9572602E38)
            android.view.ViewGroup r1 = r1.A08
            if (r1 == 0) goto L_0x04df
            android.content.Context r1 = r1.getContext()
            X.C59689JTv.A07(r1, r2)
        L_0x04df:
            r1 = -1252843023(0xffffffffb55321f1, float:-7.8653017E-7)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -640110682(0xffffffffd9d8afa6, float:-7.6239653E15)
            goto L_0x0649
        L_0x04ea:
            r0 = -1653938070(0xffffffff9d6ae86a, float:-3.1089797E-21)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -431136041(0xffffffffe64d62d7, float:-2.424771E23)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r4 = 0
            X.0qQ.A0B(r14, r4)
            java.lang.Object r3 = r13.A02
            X.0tp r3 = (X.0tp) r3
            java.lang.Object r2 = r13.A01
            X.0to r2 = (X.C62500to) r2
            X.0sn r1 = X.0sn.A00
            r3.DeY(r2, r1, r4)
            X.H51.super.onSuccess(r14)
            r1 = 118735664(0x713c330, float:1.1116411E-34)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 638080984(0x260857d8, float:4.730353E-16)
            goto L_0x0649
        L_0x0517:
            r0 = 6647969(0x6570a1, float:9.315789E-39)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -2059253584(0xffffffff854248b0, float:-9.135187E-36)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r2 = r13.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r13.A02
            X.GTL r1 = (X.GTL) r1
            com.instagram.common.session.UserSession r1 = r1.A00
            r2.AE7(r1)
            r1 = -109128446(0xfffffffff97ed502, float:-8.269773E34)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 1061803029(0x3f49d415, float:0.78839236)
            goto L_0x0649
        L_0x053d:
            r0 = 513840165(0x1ea09425, float:1.700193E-20)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 1325025536(0x4efa4900, float:2.09954406E9)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r13.A01
            android.app.Dialog r1 = (android.app.Dialog) r1
            r1.hide()
            java.lang.Object r1 = r13.A02
            X.Hpj r1 = (X.C55922Hpj) r1
            android.content.Context r2 = r1.A00
            r1 = 2131968968(0x7f1343c8, float:1.9574846E38)
            X.C59689JTv.A07(r2, r1)
            r1 = -1614327154(0xffffffff9fc7528e, float:-8.4416354E-20)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -364521502(0xffffffffea45d7e2, float:-5.9794466E25)
            goto L_0x0649
        L_0x0569:
            r0 = -2116970802(0xffffffff81d196ce, float:-7.699087E-38)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -78493654(0xfffffffffb52482a, float:-1.091846E36)
            int r5 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r4 = r13.A02
            X.33f r4 = (X.C2363033f) r4
            java.lang.Object r2 = r13.A01
            java.util.List r2 = (java.util.List) r2
            androidx.fragment.app.Fragment r3 = r4.A00
            X.4D6 r3 = (X.AnonymousClass4D6) r3
            com.instagram.common.session.UserSession r1 = r4.A01
            X.1OC r2 = X.C55017Hao.A00(r1, r2)
            r1 = 9
            X.H50.A00(r2, r4, r1)
            r3.schedule(r2)
            r1 = 473484174(0x1c38cb8e, float:6.114358E-22)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -1545111582(0xffffffffa3e777e2, float:-2.5095843E-17)
            goto L_0x0649
        L_0x059c:
            r0 = -1380884826(0xffffffffadb15ea6, float:-2.0164603E-11)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.90q r14 = (X.C3723890q) r14
            r1 = -599223462(0xffffffffdc48935a, float:-2.2582804E17)
            int r2 = X.AnonymousClass7TG.A0D(r14, r1)
            java.lang.Object r3 = r13.A02
            X.GT0 r3 = (X.GT0) r3
            X.GXO r1 = r3.A03
            if (r1 == 0) goto L_0x05bd
            X.GWY r1 = r1.A00
            X.Dbx r1 = r1.A05
            X.34p r1 = r1.A00
            r1.A02()
        L_0x05bd:
            android.content.Context r5 = r3.A09
            com.instagram.common.session.UserSession r7 = r3.A0C
            X.07i r6 = r3.A0A
            java.lang.String r8 = r14.A01
            boolean r9 = r14.A06
            X.6z9 r4 = new X.6z9
            r4.<init>(r5, r6, r7, r8, r9)
            X.GXP r1 = new X.GXP
            r1.<init>(r7, r4)
            r3.A00 = r1
            java.lang.Object r1 = r13.A01
            X.1P0 r1 = (X.1P0) r1
            r1.onSuccess(r14)
            r1 = 151232175(0x9039eaf, float:1.5843164E-33)
            X.AnonymousClass0fD.A0A(r1, r2)
            r1 = -1537160974(0xffffffffa460c8f2, float:-4.8742465E-17)
            goto L_0x0649
        L_0x05e4:
            r0 = -1636682252(0xffffffff9e7235f4, float:-1.28225306E-20)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 1077324246(0x4036a9d6, float:2.854116)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r2 = r13.A02
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r1 = r13.A01
            r2.invoke(r1)
            r1 = -41450365(0xfffffffffd878483, float:-2.2516727E37)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -756021035(0xffffffffd2f008d5, float:-5.15470164E11)
            goto L_0x0649
        L_0x0605:
            r0 = 1918656945(0x725c61b1, float:4.3651074E30)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.GyY r14 = (X.C54049GyY) r14
            r1 = -1624382962(0xffffffff9f2de20e, float:-3.6821163E-20)
            int r3 = X.AnonymousClass7TG.A0D(r14, r1)
            X.JRW r2 = r14.A00
            if (r2 != 0) goto L_0x0623
            java.lang.String r9 = "response"
        L_0x061b:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0623:
            java.lang.Object r4 = r13.A01
            X.JQc r4 = (X.C59608JQc) r4
            java.lang.Object r1 = r13.A02
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r9 = X.00k.A0j(r1)
            X.GoW r2 = (X.C53438GoW) r2
            java.lang.String r1 = r2.A00
            X.HMF r5 = X.I7G.A00(r1)
            java.util.List r7 = r2.A03
            java.util.List r8 = r2.A02
            java.lang.String r6 = r2.A01
            r4.DdT(r5, r6, r7, r8, r9)
            r1 = 1914749040(0x7220c070, float:3.1840156E30)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -1686540929(0xffffffff9b796d7f, float:-2.0632177E-22)
        L_0x0649:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H51.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(820464137);
                AnonymousClass6L1 r7 = (AnonymousClass6L1) obj;
                int A03 = AnonymousClass0fD.A03(-413836200);
                0qQ.A0B(r7, 0);
                C18734VzD vzD = (C18734VzD) this.A02;
                C18734VzD vzD2 = C18734VzD.A04;
                ConcurrentMap concurrentMap = vzD.A03;
                C17918Vi9 vi9 = (C17918Vi9) this.A01;
                String str = vi9.A04;
                concurrentMap.remove(str);
                if (!(r7.A01 == null || r7.A00 == null)) {
                    vzD.A01.put(str, r7);
                }
                C18734VzD.A00(vzD, vi9);
                AnonymousClass0fD.A0A(140484111, A03);
                i2 = -2033634081;
                break;
            case 3:
                i = AnonymousClass0fD.A03(619043714);
                int A0D = AnonymousClass7TG.A0D(obj, -1750065075);
                ((1P0) this.A01).onSuccessInBackground(obj);
                AnonymousClass0fD.A0A(-347088487, A0D);
                i2 = 1328137821;
                break;
            case 10:
                i = AnonymousClass0fD.A03(314578097);
                AnonymousClass3JC r72 = (AnonymousClass3JC) obj;
                int A0D2 = AnonymousClass7TG.A0D(r72, 1020788672);
                C278754xT r3 = (C278754xT) this.A02;
                11Z.A02(new C20303Wos((AnonymousClass540) this.A01, r3, B6X.A00(r72, r3.A03)));
                AnonymousClass0fD.A0A(664738268, A0D2);
                i2 = -960626038;
                break;
            case 11:
                i = AnonymousClass0fD.A03(1828310847);
                int A032 = AnonymousClass0fD.A03(-2042248305);
                1Xj r2 = (1Xj) this.A02;
                UserSession userSession = ((C55835HoI) this.A01).A03;
                r2.A4B(DbT.A0j(userSession));
                r2.AE7(userSession);
                AnonymousClass0fD.A0A(892419488, A032);
                i2 = -796073477;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = AnonymousClass0fD.A03(-1901151536);
                int A033 = AnonymousClass0fD.A03(-954053780);
                ((1P0) this.A01).onSuccessInBackground(obj);
                AnonymousClass0fD.A0A(1353967834, A033);
                i2 = -489612414;
                break;
            case 20:
                i = AnonymousClass0fD.A03(1552302339);
                int A034 = AnonymousClass0fD.A03(-870871343);
                C638918c.A01(C61170le.A00).A0H();
                AnonymousClass0fD.A0A(1969301407, A034);
                i2 = -2032173673;
                break;
            default:
                H51.super.onSuccessInBackground(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public H51(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
