package X;

import android.widget.ListView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.user.model.User;

/* renamed from: X.Uld  reason: case insensitive filesystem */
public final class C15961Uld extends C324596za {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C15961Uld(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final void onFail(C268654dm r7) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-878901559);
                C15396Ubz ubz = (C15396Ubz) this.A01;
                C59689JTv.A0F(ubz.getActivity(), "could_not_refresh_feed", 2131956760);
                C15396Ubz.A01(ubz);
                i2 = 1070734028;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-882910095);
                ((C15956UlY) this.A01).A03.DeI();
                i2 = -1234027652;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-2106083848);
                C15397Uc0 uc0 = (C15397Uc0) this.A01;
                C59689JTv.A0F(uc0.getActivity(), "photos_of_you_request_failed", 2131956760);
                0fE.A00(uc0.A04, 459300816);
                C15397Uc0.A03(uc0);
                i2 = -396639937;
                break;
            case 3:
                i = AnonymousClass7TG.A0D(r7, -1419821907);
                WWM wwm = ((C19733Wea) this.A01).A01;
                C59689JTv.A0B(wwm.A00, "CountdownList_something_went_wrong");
                wwm.A05.notifyDataSetChanged();
                i2 = 392102893;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-327986632);
                C17836Vgp vgp = ((C19739Weg) this.A01).A02;
                C59689JTv.A01(vgp.A00, "QuestionResponsesList_request_error", 2131972232, 1);
                vgp.A01.notifyDataSetChanged();
                i2 = 1982850728;
                break;
            case 5:
                i = AnonymousClass7TG.A0D(r7, 576497726);
                WUH wuh = ((C19740Weh) this.A01).A02;
                C59689JTv.A0B(wuh.A03, "UpcomingEventSticker_RequestFail");
                UA9 ua9 = wuh.A00;
                if (ua9 != null) {
                    ua9.notifyDataSetChanged();
                    WUH.A00(wuh);
                    i2 = -806144557;
                    break;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            default:
                C15961Uld.super.onFail(r7);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1200408065);
                0S7 r0 = (0S7) this.A01;
                0S7.A00(r0);
                ListView listView = r0.A04;
                0qQ.A0C(listView, AnonymousClass000.A00(31));
                ((RefreshableListView) listView).setIsLoading(false);
                i2 = 653999406;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-1399032859);
                ((C15956UlY) this.A01).A03.DeS();
                i2 = -376253039;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-385103344);
                i2 = -604328116;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-1919662591);
                i2 = -77959372;
                break;
            case 4:
                i = AnonymousClass0fD.A03(379322196);
                i2 = 797773449;
                break;
            case 5:
                i = AnonymousClass0fD.A03(-414936112);
                i2 = 802497054;
                break;
            default:
                C15961Uld.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-269361380);
                C15396Ubz ubz = (C15396Ubz) this.A01;
                if (ubz.A0X() != null) {
                    RefreshableListView refreshableListView = (RefreshableListView) ubz.A0X();
                    if (refreshableListView != null) {
                        refreshableListView.setIsLoading(true);
                    } else {
                        IllegalStateException A0y = AnonymousClass7TE.A0y();
                        AnonymousClass0fD.A0A(-1988894956, i);
                        throw A0y;
                    }
                }
                C15396Ubz.A01(ubz);
                i2 = 1241400502;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-674297360);
                ((C15956UlY) this.A01).A03.Dei();
                i2 = 1505944288;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-183593084);
                i2 = -1845226810;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-1420257367);
                i2 = -1569621781;
                break;
            case 4:
                i = AnonymousClass0fD.A03(348530029);
                ((C19739Weg) this.A01).A02.A01.notifyDataSetChanged();
                i2 = -188832351;
                break;
            case 5:
                i = AnonymousClass0fD.A03(-1075328829);
                i2 = 1194790845;
                break;
            default:
                C15961Uld.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0206, code lost:
        X.AnonymousClass0fD.A0A(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0209, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x031e, code lost:
        X.0qQ.A0F(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0325, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0336, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0339, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            r6 = r20
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0283;
                case 1: goto L_0x020e;
                case 2: goto L_0x010d;
                case 3: goto L_0x00c2;
                case 4: goto L_0x0065;
                case 5: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.C15961Uld.super.onSuccess(r6)
            return
        L_0x000d:
            r0 = -1052484172(0xffffffffc1445db4, float:-12.272877)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.7op r6 = (X.C342577op) r6
            r0 = 481158438(0x1cade526, float:1.1507413E-21)
            int r4 = X.AnonymousClass7TG.A0D(r6, r0)
            java.lang.Object r0 = r1.A01
            X.Weh r0 = (X.C19740Weh) r0
            X.WUH r3 = r0.A02
            boolean r0 = r1.A02
            java.lang.String r1 = "Required value was null."
            X.UA9 r2 = r3.A00
            if (r0 == 0) goto L_0x004e
            if (r2 == 0) goto L_0x0059
            java.util.List r0 = r6.A01
            com.google.common.collect.ImmutableList r1 = X.DbU.A0K(r0)
            java.util.List r0 = r2.A00
            r0.clear()
        L_0x0038:
            r0.addAll(r1)
            r2.notifyDataSetChanged()
            X.WUH.A00(r3)
            r0 = -1541360834(0xffffffffa420b33e, float:-3.4846294E-17)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1364097488(0x514e79d0, float:5.5425434E10)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x004e:
            if (r2 == 0) goto L_0x005f
            java.util.List r0 = r6.A01
            com.google.common.collect.ImmutableList r1 = X.DbU.A0K(r0)
            java.util.List r0 = r2.A00
            goto L_0x0038
        L_0x0059:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x005f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0065:
            r0 = -215485753(0xfffffffff327f2c7, float:-1.3306239E31)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Xzc r6 = (X.C22327Xzc) r6
            r0 = 1770224718(0x69837c4e, float:1.9869537E25)
            int r7 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r1.A01
            X.Weg r3 = (X.C19739Weg) r3
            X.Vgp r2 = r3.A02
            X.CDU r0 = r6.A00
            X.BAq r0 = r0.A00
            if (r0 != 0) goto L_0x0085
            java.lang.String r18 = "response"
            goto L_0x031e
        L_0x0085:
            com.instagram.reels.question.model.QuestionResponsesModel r5 = r0.A00
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1E4.A00(r0)
            boolean r0 = r1.A02
            X.UAH r4 = r2.A01
            if (r0 == 0) goto L_0x0097
            java.util.List r0 = r4.A01
            r0.clear()
        L_0x0097:
            java.util.List r0 = r5.A0A
            java.util.Iterator r3 = r0.iterator()
        L_0x009d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r2 = r3.next()
            com.instagram.reels.question.model.QuestionResponseModel r2 = (com.instagram.reels.question.model.QuestionResponseModel) r2
            java.util.List r1 = r4.A01
            X.VgE r0 = new X.VgE
            r0.<init>(r2, r5)
            r1.add(r0)
            goto L_0x009d
        L_0x00b4:
            X.UAH.A00(r4)
            r0 = 1519744965(0x5a9577c5, float:2.10357298E16)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 1646867753(0x62293529, float:7.803326E20)
            goto L_0x0206
        L_0x00c2:
            r0 = -268164504(0xfffffffff0042268, float:-1.6357446E29)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.UY8 r6 = (X.UY8) r6
            r0 = -2047149200(0xffffffff85fafb70, float:-2.360225E-35)
            int r4 = X.AnonymousClass7TG.A0D(r6, r0)
            java.lang.Object r0 = r1.A01
            X.Wea r0 = (X.C19733Wea) r0
            X.WWM r2 = r0.A01
            boolean r0 = r1.A02
            X.UAB r3 = r2.A05
            java.util.List r1 = r6.A00()
            if (r0 == 0) goto L_0x00e7
            java.util.List r0 = r3.A02
            r0.clear()
        L_0x00e7:
            java.util.List r2 = r3.A02
            boolean r0 = r2.containsAll(r1)
            if (r0 != 0) goto L_0x0102
            r2.addAll(r1)
            java.util.List r1 = r3.A01
            r1.clear()
            java.util.List r0 = r3.A03
            r1.addAll(r0)
            r1.addAll(r2)
            r3.notifyDataSetChanged()
        L_0x0102:
            r0 = -1919406810(0xffffffff8d982d26, float:-9.378592E-31)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1226305309(0x4917ef1d, float:622321.8)
            goto L_0x0206
        L_0x010d:
            r0 = 1912141244(0x71f8f5bc, float:2.4655794E30)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.1XO r6 = (X.1XO) r6
            r0 = 1727950471(0x66fe6e87, float:6.0075998E23)
            int r8 = X.AnonymousClass0fD.A03(r0)
            boolean r7 = r1.A02
            if (r7 == 0) goto L_0x013a
            java.lang.Object r2 = r1.A01
            X.Uc0 r2 = (X.C15397Uc0) r2
            r2.EKl()
            java.util.List r0 = r2.A0M
            r0.clear()
            X.UdE r2 = r2.A04
            X.4n0 r0 = r2.A07
            r0.A04()
            r0 = -1812157705(0xffffffff93fcaaf7, float:-6.3782328E-27)
            X.0fE.A00(r2, r0)
        L_0x013a:
            java.util.List r0 = r6.A06
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01e9
            java.util.List r3 = r6.A06
            java.lang.Object r11 = r1.A01
            X.Uc0 r11 = (X.C15397Uc0) r11
            java.util.List r0 = r11.A0M
            r0.addAll(r3)
            java.util.ListIterator r4 = r3.listIterator()
            com.instagram.common.session.UserSession r0 = r11.A03
            X.0xa r2 = X.AnonymousClass7TE.A0q(r0)
            r0 = 3800(0xed8, float:5.325E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.Set r2 = r2.C1t(r0)
        L_0x0161:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x017e
            java.lang.Object r0 = r4.next()
            r0.getClass()
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = r0.getId()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0161
            r4.remove()
            goto L_0x0161
        L_0x017e:
            X.UdE r2 = r11.A04
            X.4n0 r0 = r2.A07
            r0.A0A(r3)
            r0 = 1777587124(0x69f3d3b4, float:3.684609E25)
            X.0fE.A00(r2, r0)
            X.UdE r3 = r11.A04
            X.XAi r0 = r11.A08
            boolean r2 = r0.CKB()
            X.4n0 r0 = r3.A07
            r0.A01 = r2
            r0 = -527475741(0xffffffffe08f5be3, float:-8.26408E19)
            X.0fE.A00(r3, r0)
            android.content.Context r10 = r11.getContext()
            if (r10 == 0) goto L_0x01e9
            java.util.List r12 = r6.A06
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5 = 0
        L_0x01ab:
            int r0 = r12.size()
            if (r5 >= r0) goto L_0x01dc
            X.1Xj r4 = X.DbZ.A0T(r12, r5)
            java.lang.String r3 = "feed_photos_of_you"
            com.instagram.common.session.UserSession r2 = r11.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.3Vo r13 = X.C242663Vj.A03(r10, r2, r4, r0, r3)
            int r3 = r5 / 3
            int r2 = r5 % 3
            X.73W r0 = new X.73W
            r0.<init>(r3, r2)
            X.1yX r4 = new X.1yX
            r4.<init>(r13, r0)
            int r3 = r0.A01
            int r2 = r0.A00
            X.9IN r0 = new X.9IN
            r0.<init>(r4, r3, r2)
            r6.add(r0)
            int r5 = r5 + 1
            goto L_0x01ab
        L_0x01dc:
            com.instagram.common.session.UserSession r0 = r11.A03
            X.1y3 r2 = X.1y1.A00(r0)
            java.lang.String r0 = "feed_photos_of_you"
            if (r7 == 0) goto L_0x020a
            r2.A06(r0, r6)
        L_0x01e9:
            java.lang.Object r2 = r1.A01
            X.Uc0 r2 = (X.C15397Uc0) r2
            X.UdE r1 = r2.A04
            r0 = 1
            r1.A04 = r0
            X.C15463UdE.A00(r1)
            X.C15397Uc0.A03(r2)
            X.2dZ r0 = r2.A00
            r0.A0T()
            r0 = -1682914600(0xffffffff9bb0c2d8, float:-2.9242672E-22)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = -775002204(0xffffffffd1ce67a4, float:-1.10812758E11)
        L_0x0206:
            X.AnonymousClass0fD.A0A(r0, r9)
            return
        L_0x020a:
            r2.A05(r0, r6)
            goto L_0x01e9
        L_0x020e:
            r0 = 703735177(0x29f22589, float:1.075347E-13)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.UY7 r6 = (X.UY7) r6
            r0 = 1185141813(0x46a3d435, float:20970.104)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r6, r4)
            java.lang.Object r5 = r1.A01
            X.UlY r5 = (X.C15956UlY) r5
            com.instagram.common.session.UserSession r7 = r5.A01
            X.VcP r8 = X.C18211Vnb.A01(r7, r6)
            X.0qQ.A0B(r7, r4)
            java.lang.Class<X.Ul0> r6 = X.C15933Ul0.class
            X.Wwh r0 = X.C20649Wwh.A00
            java.lang.Object r7 = r7.A01(r6, r0)
            X.Vip r7 = (X.C17957Vip) r7
            java.lang.String r9 = r5.A08
            X.Uz8 r6 = r5.A02
            X.AnonymousClass7TF.A1H(r9, r6)
            X.VbH r0 = r7.A00(r9)
            X.Ul4 r0 = (X.C15937Ul4) r0
            r0.A00 = r6
            X.VuR r6 = r5.A05
            X.6z9 r0 = X.C18459Vs8.A00(r6)
            X.6zA r0 = r0.A03
            java.lang.String r10 = r0.A07
            X.Uz8 r0 = r6.A00
            X.Vs8 r0 = X.C18575VuR.A00(r0, r6)
            java.lang.String r11 = r0.A00
            X.Uz8 r0 = r6.A00
            X.Vs8 r0 = X.C18575VuR.A00(r0, r6)
            java.util.List r12 = r0.A01
            boolean r13 = r1.A02
            r7.A01(r8, r9, r10, r11, r12, r13)
            java.util.List r1 = r8.A07
            X.6vO r0 = r5.A04
            java.util.ArrayList r8 = X.C16931VBj.A00(r0, r1)
            X.JRI r5 = r5.A03
            r6 = 0
            r7 = r6
            r9 = r4
            r10 = r13
            r5.Dex(r6, r7, r8, r9, r10)
            r0 = -1409027417(0xffffffffac03f2a7, float:-1.8750919E-12)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -61787909(0xfffffffffc5130fb, float:-4.344734E36)
            goto L_0x0336
        L_0x0283:
            r0 = 386105368(0x17038018, float:4.249006E-25)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.CGQ r6 = (X.CGQ) r6
            r0 = -21828911(0xfffffffffeb2ead1, float:-1.1891091E38)
            int r4 = X.AnonymousClass7TG.A0D(r6, r0)
            java.lang.Object r5 = r1.A01
            X.Ubz r5 = (X.C15396Ubz) r5
            X.C15396Ubz.A01(r5)
            boolean r11 = r1.A02
            java.lang.String r18 = "adapter"
            if (r11 == 0) goto L_0x02ac
            X.UdF r1 = r5.A00
            if (r1 == 0) goto L_0x031e
            X.4n0 r0 = r1.A02
            r0.A04()
            r1.A0C()
        L_0x02ac:
            X.UdF r0 = r5.A00
            if (r0 == 0) goto L_0x031e
            X.4n0 r0 = r0.A02
            int r0 = r0.A02()
            r17 = 3
            int r16 = r0 * 3
            java.util.List r13 = r6.A01
            int r12 = r13.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r12)
            r10 = 0
        L_0x02c6:
            if (r10 >= r12) goto L_0x02f9
            int r9 = r16 + r10
            int r8 = r9 / r17
            int r9 = r9 % r17
            X.1Xj r15 = X.DbZ.A0T(r13, r10)
            android.content.Context r14 = r5.requireContext()
            java.lang.String r3 = "archive_feed"
            X.0eM r0 = r5.A07
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.3Vo r3 = X.C242663Vj.A03(r14, r1, r15, r0, r3)
            X.73W r0 = new X.73W
            r0.<init>(r8, r9)
            X.1yX r1 = new X.1yX
            r1.<init>(r3, r0)
            X.9IN r0 = new X.9IN
            r0.<init>(r1, r8, r9)
            r7.add(r0)
            int r10 = r10 + 1
            goto L_0x02c6
        L_0x02f9:
            X.0eM r0 = r5.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1y3 r1 = X.1y1.A00(r0)
            java.lang.String r0 = "archive_feed"
            if (r11 == 0) goto L_0x0326
            r1.A06(r0, r7)
        L_0x030a:
            X.UdF r3 = r5.A00
            if (r3 == 0) goto L_0x031e
            java.util.List r1 = r6.A01
            X.4n0 r0 = r3.A02
            r0.A0A(r1)
            r3.A0C()
            X.36D r0 = r5.A01
            if (r0 != 0) goto L_0x032a
            java.lang.String r18 = "mediaUpdateListener"
        L_0x031e:
            X.0qQ.A0F(r18)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0326:
            r1.A05(r0, r7)
            goto L_0x030a
        L_0x032a:
            r0.A00()
            r0 = 1109282465(0x421e4ea1, float:39.576786)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 870492549(0x33e2a985, float:1.05547805E-7)
        L_0x0336:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15961Uld.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1777990462);
                AnonymousClass0fD.A0A(-379587259, AnonymousClass0fD.A03(839806501));
                i2 = -339049548;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-1144227899);
                AnonymousClass0fD.A0A(-2095923896, AnonymousClass0fD.A03(454769020));
                i2 = 1668186151;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1030836325);
                CHY chy = (CHY) obj;
                int A03 = AnonymousClass0fD.A03(-1663744182);
                Boolean bool = chy.A00;
                if (bool != null && bool.booleanValue()) {
                    C15397Uc0 uc0 = (C15397Uc0) this.A01;
                    User A0j = DbT.A0j(uc0.A03);
                    if (A0j.getId().equals(uc0.A0C)) {
                        A0j.A03.Ept(chy.A00);
                        17h.A00(uc0.A03).A03(A0j);
                    }
                }
                AnonymousClass0fD.A0A(1769677403, A03);
                i2 = 1376617918;
                break;
            case 3:
                i = AnonymousClass0fD.A03(354784983);
                AnonymousClass0fD.A0A(-658335366, AnonymousClass0fD.A03(1487291529));
                i2 = -2068918739;
                break;
            case 4:
                i = AnonymousClass0fD.A03(139086560);
                AnonymousClass0fD.A0A(-438768884, AnonymousClass0fD.A03(-739980537));
                i2 = -1066411020;
                break;
            case 5:
                i = AnonymousClass0fD.A03(719156450);
                AnonymousClass0fD.A0A(1896905751, AnonymousClass0fD.A03(-1350103371));
                i2 = 2137174890;
                break;
            default:
                C15961Uld.super.onSuccessInBackground(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
