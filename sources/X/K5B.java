package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.mediakit.model.MediaKitSectionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class K5B extends AnonymousClass4DH implements AnonymousClass4DS, MXF {
    public static final String __redex_internal_original_name = "MediaKitMediaPickerTabFragment";
    public View A00;
    public ViewPager2 A01;
    public TabLayout A02;
    public AnonymousClass2t9 A03;
    public C60727JqG A04;
    public LAT A05;
    public C324826zy A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = DbS.A0I(new MMD(this, 33), new MMD(this, 32), MMW.A00((Object) null, this, 16), DbS.A0z(C60327JjW.class));
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C = MMD.A00(this, 31);

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        C60326JjV.A01(JTT.A0Z(this), new MYK(str, 38));
    }

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        AnonymousClass0eM r2 = this.A0B;
        r5.ErN(A00((C62533KhP) this.A08.getValue(), this, ((C60326JjV) r2.getValue()).A02().size()));
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = getString(2131968361);
        DbX.A19(LY6.A00(this, 61), A0K, r5);
        r5.ARb(0, ((C60326JjV) r2.getValue()).A04());
    }

    public final String getModuleName() {
        return "MediaKitSelectMediaTabFragment";
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            r16 = this;
            r12 = 0
            r2 = r17
            X.0qQ.A0B(r2, r12)
            r13 = r16
            r0 = r18
            super.onViewCreated(r2, r0)
            X.0eM r0 = r13.A08
            java.lang.Object r0 = r0.getValue()
            X.KhP r0 = (X.C62533KhP) r0
            int r0 = r0.ordinal()
            r5 = 1
            if (r0 == r12) goto L_0x004b
            r3 = 2
            if (r0 != r5) goto L_0x013d
            X.LAT r1 = r13.A05
            java.lang.String r0 = "pickerConfig"
            if (r1 != 0) goto L_0x002d
            X.0qQ.A0F(r0)
        L_0x0028:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002d:
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x004b
            boolean r0 = r1.A06
            X.KhX[] r1 = new X.C62541KhX[r3]
            if (r0 == 0) goto L_0x0044
            X.KhX r0 = X.C62541KhX.POSTS
            r1[r12] = r0
            X.KhX r0 = X.C62541KhX.GALLERY
        L_0x003d:
            r1[r5] = r0
            java.util.List r3 = X.0sr.A1P(r1)
            goto L_0x0051
        L_0x0044:
            X.KhX r0 = X.C62541KhX.GALLERY
            r1[r12] = r0
            X.KhX r0 = X.C62541KhX.POSTS
            goto L_0x003d
        L_0x004b:
            X.KhX r0 = X.C62541KhX.POSTS
            java.util.List r3 = X.AnonymousClass7TE.A1I(r0)
        L_0x0051:
            r0 = 17
            X.MP7 r1 = new X.MP7
            r1.<init>(r13, r0)
            X.JqG r0 = new X.JqG
            r0.<init>(r13, r3, r1)
            r13.A04 = r0
            r0 = 2131443875(0x7f0b40a3, float:1.850983E38)
            android.view.View r1 = r2.requireViewById(r0)
            androidx.viewpager2.widget.ViewPager2 r1 = (androidx.viewpager2.widget.ViewPager2) r1
            X.JqG r0 = r13.A04
            if (r0 != 0) goto L_0x0072
            java.lang.String r6 = "tabPagerAdapter"
        L_0x006e:
            X.0qQ.A0F(r6)
            goto L_0x0028
        L_0x0072:
            r1.setAdapter(r0)
            r13.A01 = r1
            r0 = 2131442409(0x7f0b3ae9, float:1.8506857E38)
            android.view.View r0 = r2.requireViewById(r0)
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            r13.A02 = r0
            X.0eM r4 = r13.A0B
            java.lang.Object r1 = r4.getValue()
            X.JjV r1 = (X.C60326JjV) r1
            X.KhP r0 = r1.A02
            int r0 = X.C60326JjV.A00(r0, r1)
            if (r0 <= r5) goto L_0x010c
            androidx.fragment.app.FragmentActivity r1 = r13.requireActivity()
            X.0eM r0 = r13.A0A
            r0.getValue()
            int r10 = X.AnonymousClass8XE.A01(r1)
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r7 = r13.requireActivity()
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            X.8Qq r6 = new X.8Qq
            r11 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.2tC r1 = X.DbV.A0S(r13)
            X.KFO r0 = new X.KFO
            r0.<init>(r13)
            r1.A01(r0)
            X.KFd r0 = new X.KFd
            r0.<init>(r6, r13)
            X.2t9 r0 = X.DbU.A0U(r1, r0)
            r13.A03 = r0
            r0 = 2131441039(0x7f0b358f, float:1.8504078E38)
            android.view.View r6 = X.DbY.A0F(r2, r0)
            r13.A00 = r6
            r0 = 2131441041(0x7f0b3591, float:1.8504082E38)
            androidx.recyclerview.widget.RecyclerView r3 = X.DbT.A0I(r6, r0)
            android.content.Context r0 = r3.getContext()
            X.DbV.A1A(r0, r3)
            X.2t9 r0 = r13.A03
            r3.setAdapter(r0)
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r2 = X.DbS.A03(r1, r0)
            android.content.res.Resources r1 = X.DbV.A05(r13)
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            int r1 = X.DbS.A03(r1, r0)
            X.Jlp r0 = new X.Jlp
            r0.<init>(r2, r1)
            r3.A11(r0)
            r0 = 2131439818(0x7f0b30ca, float:1.8501602E38)
            android.view.View r1 = r6.requireViewById(r0)
            r0 = 62
            X.LY6.A01(r1, r0, r13)
        L_0x010c:
            com.google.android.material.tabs.TabLayout r3 = r13.A02
            java.lang.String r2 = "tabLayout"
            if (r3 == 0) goto L_0x0138
            X.JqG r0 = r13.A04
            java.lang.String r6 = "tabPagerAdapter"
            if (r0 == 0) goto L_0x006e
            int r1 = r0.getItemCount()
            r0 = 0
            if (r1 > r5) goto L_0x0121
            r0 = 8
        L_0x0121:
            r3.setVisibility(r0)
            X.JqG r0 = r13.A04
            if (r0 == 0) goto L_0x006e
            int r0 = r0.getItemCount()
            if (r0 <= r5) goto L_0x0150
            com.google.android.material.tabs.TabLayout r3 = r13.A02
            if (r3 == 0) goto L_0x0138
            androidx.viewpager2.widget.ViewPager2 r2 = r13.A01
            if (r2 != 0) goto L_0x0142
            java.lang.String r2 = "viewPager"
        L_0x0138:
            X.0qQ.A0F(r2)
            goto L_0x0028
        L_0x013d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0142:
            r0 = 2
            X.Lc2 r1 = new X.Lc2
            r1.<init>(r13, r0)
            X.MgQ r0 = new X.MgQ
            r0.<init>(r2, r3, r1)
            r0.A00()
        L_0x0150:
            java.lang.Object r11 = r4.getValue()
            X.07U r12 = X.07U.A05
            X.07Z r10 = r13.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r10)
            r14 = 0
            r15 = 6
            X.MHL r9 = new X.MHL
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.AnonymousClass7TE.A1Z(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5B.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final LDW BO3() {
        return (LDW) this.A0C.getValue();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public K5B() {
        MMD mmd = new MMD(this, 37);
        MMD mmd2 = new MMD(this, 34);
        0eO r4 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r4, new MMD(mmd2, 35));
        this.A0B = DbS.A0I(new MMD(A002, 36), mmd, MMW.A00((Object) null, A002, 17), DbS.A0z(C60326JjV.class));
        this.A07 = AnonymousClass0eN.A00(r4, new MMD(this, 29));
        this.A0A = C227642jf.A02(this);
        this.A08 = MMD.A00(this, 30);
    }

    public static final String A00(C62533KhP khP, K5B k5b, int i) {
        String string;
        if (khP.ordinal() != 0) {
            return DbU.A0m(k5b, 2131966560);
        }
        if (i > 0) {
            string = k5b.getString(2131966645, AnonymousClass7TF.A1b(i));
        } else {
            string = k5b.getString(2131966642);
        }
        0qQ.A0A(string);
        return string;
    }

    public final void onCreate(Bundle bundle) {
        C60326JjV jjV;
        Object obj;
        int i;
        Object obj2;
        int A022 = AnonymousClass0fD.A02(-1320205925);
        K5B.super.onCreate(bundle);
        this.A05 = LJF.A01(AnonymousClass7TE.A0l(this.A0A));
        int ordinal = ((C62533KhP) this.A08.getValue()).ordinal();
        if (ordinal == 0) {
            String A012 = C320236s2.A01(requireArguments(), "section_id");
            C60326JjV A0Z = JTT.A0Z(this);
            jjV = A0Z;
            ArrayList arrayList = JTT.A0a(this.A09).A07.A02.A04;
            0qQ.A0B(arrayList, 1);
            boolean z = true;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C61220JzD.A01(A012, it)) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            A0Z.A01 = z;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (0qQ.A0K(((C61220JzD) obj).A03, A012)) {
                    break;
                }
            }
            C61220JzD jzD = (C61220JzD) obj;
            if (jzD == null) {
                if (A012 != null) {
                    C61220JzD A002 = LQJ.A00(MediaKitSectionType.MEDIA_POSTS, A012, "");
                    String str = A002.A03;
                    String str2 = A002.A04;
                    MediaKitSectionType mediaKitSectionType = A002.A01;
                    0sn r0 = 0sn.A00;
                    0qQ.A0B(r0, 1);
                    jzD = C63319Kv2.A00(C63317Kv0.A00(LQI.A00(r0).A00, false), mediaKitSectionType, "", str, str2, (List) null, (List) null);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            A0Z.A00 = jzD;
            i = 19;
            obj2 = A0Z;
        } else if (ordinal == 1) {
            jjV = JTT.A0Z(this);
            Object value = JTT.A0a(this.A09).A0K.getValue();
            0qQ.A0B(value, 0);
            i = 18;
            obj2 = value;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        C60326JjV.A01(jjV, new MP7(obj2, i));
        AnonymousClass0fD.A09(412922839, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(807159595);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_media_picker_tab_fragment, false);
        AnonymousClass0fD.A09(-1084706316, A022);
        return A0D;
    }
}
