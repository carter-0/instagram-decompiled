package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.E4p  reason: case insensitive filesystem */
public final class C47485E4p extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, G7Z, G6T {
    public static final String __redex_internal_original_name = "ShortcutsAudiencePickerFragment";
    public IgSimpleImageView A00;
    public E9C A01;
    public Fl1 A02;
    public IgdsButton A03;
    public String A04;
    public List A05 = 0sn.A00;
    public boolean A06;
    public final FAN A07 = new FAN();
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final String A09 = "shortcuts_audience_picker";

    public final void CtJ(C46448DfA dfA) {
    }

    public final void CwR(C47159Dra dra, IgdsCheckBox igdsCheckBox) {
        C47159Dra dra2;
        0qQ.A0B(igdsCheckBox, 1);
        boolean z = !igdsCheckBox.isChecked();
        igdsCheckBox.setChecked(z);
        FAN fan = this.A07;
        Fl1 fl1 = this.A02;
        String str = "searchController";
        if (fl1 != null) {
            boolean z2 = fl1.A03;
            if (z) {
                FAN.A00(dra, fan, z2);
            } else {
                dra.A04 = false;
                Set set = fan.A03;
                Iterator it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (0qQ.A0K(it.next(), dra)) {
                            dra2 = dra;
                            break;
                        }
                    } else {
                        dra2 = null;
                        break;
                    }
                }
                0u4.A00(set).remove(dra2);
                ExV exV = fan.A01;
                DirectShareTarget directShareTarget = dra.A07;
                0qQ.A0B(directShareTarget, 0);
                exV.A01.add(directShareTarget);
                exV.A00.remove(directShareTarget);
                exV.A02.remove(directShareTarget);
                C49462Ew3 ew3 = fan.A02;
                F31 f31 = new F31(directShareTarget);
                Set set2 = ew3.A00;
                if (set2.contains(f31)) {
                    set2.remove(f31);
                } else {
                    ew3.A01.add(f31);
                }
            }
            E9C e9c = this.A01;
            if (e9c == null) {
                str = "directListAdapter";
            } else {
                Set set3 = fan.A03;
                ImmutableList A0K = DbU.A0K(set3);
                List list = e9c.A0B;
                list.clear();
                List list2 = e9c.A0D;
                list2.clear();
                list.addAll(A0K);
                list2.addAll(A0K);
                List list3 = e9c.A0C;
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it2 = A0K.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    C47159Dra dra3 = (C47159Dra) next;
                    if (dra3.A03 && !list3.contains(dra3)) {
                        A1C.add(next);
                    }
                }
                list3.addAll(A1C);
                Fl1 fl12 = this.A02;
                if (fl12 != null) {
                    fl12.A06.setVisibility(8);
                    IgdsInlineSearchBox igdsInlineSearchBox = fl12.A0A;
                    igdsInlineSearchBox.A0E.setText("");
                    C336267eL r0 = fl12.A00;
                    if (r0 != null) {
                        r0.EhX("");
                        igdsInlineSearchBox.A03();
                        int size = set3.size();
                        IgdsButton igdsButton = this.A03;
                        if (igdsButton != null) {
                            igdsButton.setEnabled(AnonymousClass7TF.A1R(size));
                            return;
                        }
                        return;
                    }
                    str = "searchProvider";
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D8x(C47159Dra dra) {
    }

    public final boolean Es1(C47159Dra dra) {
        return false;
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        boolean z = this.A06;
        Resources A052 = DbV.A05(this);
        int i = 2131973848;
        if (z) {
            i = 2131961510;
        }
        r4.ErN(AnonymousClass7TF.A0d(A052, i));
        r4.Eu4(true);
        DbX.A1A(FP8.A00(this, 18), DbV.A0K(), r4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.G7Z} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r0 = 0
            r1 = r21
            X.0qQ.A0B(r1, r0)
            r9 = r20
            r2 = r22
            super.onViewCreated(r1, r2)
            android.os.Bundle r3 = r9.requireArguments()
            java.lang.String r2 = "is_edit_mode"
            boolean r2 = r3.getBoolean(r2)
            r9.A06 = r2
            android.content.Context r5 = r9.requireContext()
            X.0eM r3 = r9.A08
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r3)
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            r2 = 0
            X.E9C r4 = new X.E9C
            r6 = r9
            r8 = r9
            r10 = r13
            r11 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r9.A01 = r4
            android.content.Context r15 = r9.requireContext()
            X.L9z r14 = new X.L9z
            r16 = r2
            r17 = r2
            r18 = r0
            r19 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            r4.A00 = r14
            r4 = 2131440786(0x7f0b3492, float:1.8503565E38)
            android.view.View r12 = X.AnonymousClass7TF.A0F(r1, r4)
            com.instagram.igds.components.search.IgdsInlineSearchBox r12 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r12
            r4 = 2131973847(0x7f1356d7, float:1.9584741E38)
            r12.setHint((int) r4)
            android.content.res.Resources r5 = X.DbV.A05(r9)
            r4 = 2131165216(0x7f070020, float:1.7944643E38)
            int r4 = r5.getDimensionPixelSize(r4)
            float r4 = (float) r4
            r12.setTextsize(r4)
            r4 = 2131440802(0x7f0b34a2, float:1.8503598E38)
            android.view.View r7 = X.AnonymousClass7TF.A0G(r1, r4)
            android.content.Context r5 = r9.requireContext()
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r3)
            X.0gy r8 = X.AnonymousClass07i.A00(r9)
            X.E9C r11 = r9.A01
            if (r11 == 0) goto L_0x01f0
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            X.Fl1 r4 = new X.Fl1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r9.A02 = r4
            X.FPK r4 = new X.FPK
            r4.<init>(r0, r7, r9)
            r12.A00 = r4
            r5 = 22
            X.FPH r4 = new X.FPH
            r4.<init>((int) r5, (java.lang.Object) r12, (java.lang.Object) r9, (java.lang.Object) r7)
            X.AnonymousClass0fU.A00(r4, r7)
            X.7fS r5 = X.C317486nL.A04
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r3)
            X.6nL[] r8 = r5.A07(r4)
            int r4 = r8.length
            X.2HY r5 = new X.2HY
            r5.<init>(r0, r4)
            X.2SQ r4 = X.2SP.A00
            int r6 = X.C229632nm.A04(r4, r5)
            android.os.Bundle r5 = r9.requireArguments()
            java.lang.String r4 = "shortcut_emoji"
            java.lang.String r7 = r5.getString(r4)
            if (r7 != 0) goto L_0x00bb
            r4 = r8[r6]
            java.lang.String r7 = r4.A02
        L_0x00bb:
            r9.A04 = r7
            android.view.View r5 = r9.requireView()
            r4 = 2131432305(0x7f0b1371, float:1.8486364E38)
            android.view.View r6 = X.AnonymousClass7TF.A0F(r5, r4)
            android.view.View r5 = r9.requireView()
            r4 = 2131441337(0x7f0b36b9, float:1.8504683E38)
            android.widget.TextView r8 = X.AnonymousClass7TG.A0R(r5, r4)
            android.content.Context r5 = r9.requireContext()
            r4 = 2131973849(0x7f1356d9, float:1.9584745E38)
            X.DbT.A18(r5, r8, r4)
            android.view.View r5 = r9.requireView()
            r4 = 2131441336(0x7f0b36b8, float:1.850468E38)
            android.view.View r4 = r5.requireViewById(r4)
            com.instagram.common.ui.base.IgSimpleImageView r4 = (com.instagram.common.ui.base.IgSimpleImageView) r4
            r9.A00 = r4
            android.content.Context r5 = r9.getContext()
            r4 = 2130970211(0x7f040663, float:1.7549126E38)
            int r4 = X.2Yu.A0F(r5, r4)
            com.instagram.common.ui.base.IgSimpleImageView r5 = r9.A00
            if (r5 == 0) goto L_0x0102
            android.graphics.drawable.ShapeDrawable r4 = X.I7E.A03(r4)
            r5.setBackground(r4)
        L_0x0102:
            com.instagram.common.ui.base.IgSimpleImageView r4 = r9.A00
            if (r4 == 0) goto L_0x0109
            X.I7E.A07(r4, r7)
        L_0x0109:
            r4 = 20
            X.FP8.A01(r6, r4, r9)
            r4 = 2131440786(0x7f0b3492, float:1.8503565E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r1, r4)
            r4 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            android.view.View r4 = X.AnonymousClass7TF.A0F(r1, r4)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            X.DbY.A16(r9, r4)
            X.E9C r1 = r9.A01
            if (r1 == 0) goto L_0x01f0
            r4.setAdapter(r1)
            r1 = 6
            X.C46864Dmg.A00(r4, r5, r1)
            X.1Av r1 = X.DbX.A0h(r3)
            X.0xa r1 = r1.A01
            java.lang.String r6 = "shortcut_creation_nux_seen_count"
            int r4 = r1.getInt(r6, r0)
            r1 = 3
            if (r4 >= r1) goto L_0x016b
            android.view.View r4 = r9.requireView()
            r1 = 2131428239(0x7f0b038f, float:1.8478117E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r4, r1)
            android.content.Context r4 = r9.requireContext()
            r1 = 2131973846(0x7f1356d6, float:1.958474E38)
            X.DbT.A18(r4, r5, r1)
            r5.setVisibility(r0)
            X.1Av r1 = X.DbX.A0h(r3)
            X.0xa r3 = r1.A01
            java.lang.String r1 = "create_sharesheet_shortcut_nux_seen_count"
            int r1 = r3.getInt(r1, r0)
            X.0xY r3 = r3.AR4()
            int r1 = r1 + 1
            r3.E5Z(r6, r1)
            r3.apply()
        L_0x016b:
            android.os.Bundle r3 = r9.requireArguments()
            java.lang.String r1 = "DirectShareSheetConstants.selected_share_targets"
            java.util.ArrayList r1 = r3.getParcelableArrayList(r1)
            if (r1 == 0) goto L_0x017b
            java.util.List r2 = X.00k.A0X(r1)
        L_0x017b:
            r9.A05 = r2
            if (r2 == 0) goto L_0x01af
            X.E9C r1 = r9.A01
            if (r1 == 0) goto L_0x01f0
            r1.A00(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x018a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x01af
            java.lang.Object r12 = r3.next()
            com.instagram.model.direct.DirectShareTarget r12 = (com.instagram.model.direct.DirectShareTarget) r12
            X.FAN r2 = r9.A07
            r15 = 1
            X.Dra r11 = new X.Dra
            r14 = r0
            r16 = r15
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            X.Fl1 r1 = r9.A02
            java.lang.String r4 = "searchController"
            if (r1 == 0) goto L_0x01f2
            boolean r1 = r1.A03
            X.FAN.A00(r11, r2, r1)
            goto L_0x018a
        L_0x01af:
            android.view.View r2 = r9.requireView()
            r1 = 2131432000(0x7f0b1240, float:1.8485745E38)
            com.instagram.igds.components.button.IgdsButton r3 = X.DbU.A0b(r2, r1)
            r3.setEnabled(r0)
            boolean r2 = r9.A06
            r1 = 2131973845(0x7f1356d5, float:1.9584737E38)
            if (r2 == 0) goto L_0x01c7
            r1 = 2131972502(0x7f135196, float:1.9582013E38)
        L_0x01c7:
            r3.setText((int) r1)
            r9.A03 = r3
            X.FAN r1 = r9.A07
            java.util.Set r1 = r1.A03
            int r1 = r1.size()
            com.instagram.igds.components.button.IgdsButton r2 = r9.A03
            if (r2 == 0) goto L_0x01df
            boolean r1 = X.AnonymousClass7TF.A1R(r1)
            r2.setEnabled(r1)
        L_0x01df:
            com.instagram.igds.components.button.IgdsButton r2 = r9.A03
            if (r2 == 0) goto L_0x01e8
            r1 = 19
            X.FP8.A01(r2, r1, r9)
        L_0x01e8:
            com.instagram.igds.components.button.IgdsButton r1 = r9.A03
            if (r1 == 0) goto L_0x01ef
            r1.setVisibility(r0)
        L_0x01ef:
            return
        L_0x01f0:
            java.lang.String r4 = "directListAdapter"
        L_0x01f2:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47485E4p.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final String getModuleName() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final boolean onBackPressed() {
        DbT.A1K(this);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-88139081);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_shortcuts_audience_picker, viewGroup, false);
        AnonymousClass0fD.A09(-2098587848, A022);
        return inflate;
    }
}
