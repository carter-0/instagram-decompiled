package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.mediakit.model.MediaKitSectionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class KXh extends K6S implements MXF {
    public static final String __redex_internal_original_name = "MediaKitProfilePickerFragment";
    public String A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = MMD.A00(this, 39);

    public final void configureActionBar(2da r4) {
        String string;
        0qQ.A0B(r4, 0);
        int A05 = DbS.A05(((C60245Ji2) this.A03.getValue()).A0B.getValue());
        if (A05 > 0) {
            string = getString(2131966574, AnonymousClass7TF.A1b(A05));
        } else {
            string = getString(2131966563);
        }
        0qQ.A07(string);
        r4.ErN(string);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = getString(2131968361);
        DbX.A19(LY6.A00(this, 63), A0K, r4);
        r4.ARb(0, false);
    }

    public final String getModuleName() {
        return "MediaKitAudiencePickerFragment";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((IgdsInlineSearchBox) view.requireViewById(R.id.search_box)).setHint(2131966562);
        JTS.A0y(view, R.id.audience_picker_disclaimer_text);
        A09().A00 = new C63870L9z(requireContext(), "", "", R.drawable.ig_illustrations_qp_search_refresh, false);
        K6S.A02(this);
        07U r6 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r6, this, (AnonymousClass4D7) null, 22), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final LDW BO3() {
        return (LDW) this.A04.getValue();
    }

    public final void CtJ(C46448DfA dfA) {
        C60245Ji2 ji2 = (C60245Ji2) this.A03.getValue();
        05G r5 = ji2.A0C;
        05G r4 = ji2.A0B;
        Set<C61036Jva> A0n = 00k.A0n(JTO.A0x(r4), JTO.A0x(r5));
        for (C61036Jva jva : A0n) {
            jva.A01 = false;
        }
        r5.Epw(AnonymousClass7TE.A1D(A0n));
        r4.Epw(0sn.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public KXh() {
        MMD mmd = new MMD(this, 43);
        MMD mmd2 = new MMD(this, 40);
        0eO r5 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r5, new MMD(mmd2, 41));
        this.A03 = DbS.A0I(new MMD(A002, 42), mmd, MMW.A00((Object) null, A002, 18), DbS.A0z(C60245Ji2.class));
        this.A01 = AnonymousClass0eN.A00(r5, new MMD(this, 38));
    }

    public final void A0C(IgdsCheckBox igdsCheckBox, C61036Jva jva) {
        ArrayList arrayList;
        int i;
        int i2;
        AnonymousClass7TG.A1N(jva, igdsCheckBox);
        boolean z = !igdsCheckBox.isChecked();
        C60245Ji2 ji2 = (C60245Ji2) this.A03.getValue();
        boolean z2 = !igdsCheckBox.isChecked();
        String id = jva.A02.getId();
        if (!z2 || DbS.A05(ji2.A0B.getValue()) < (i2 = ji2.A07.A00)) {
            jva.A01 = z2;
            05G r7 = ji2.A0B;
            ArrayList A1D = AnonymousClass7TE.A1D(JTO.A13(r7));
            05G r5 = ji2.A0C;
            ArrayList A1D2 = AnonymousClass7TE.A1D(JTO.A13(r5));
            if (z2) {
                A1D.add(jva);
                arrayList = A1D2;
                i = 39;
            } else {
                A1D2.add(jva);
                arrayList = A1D;
                i = 40;
            }
            MYK myk = new MYK(id, i);
            ArrayList<Object> A1C = AnonymousClass7TE.A1C();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (C51971G9r.A1a(next, myk)) {
                    A1C.add(next);
                }
            }
            for (Object remove : A1C) {
                arrayList.remove(remove);
            }
            r7.Epw(A1D);
            r5.Epw(A1D2);
            igdsCheckBox.setChecked(z);
            return;
        }
        MH3.A00(ji2, new C63660L1w(i2), C318116oQ.A00(ji2), 16);
    }

    public final void onCreate(Bundle bundle) {
        Object obj;
        ArrayList arrayList;
        int A022 = AnonymousClass0fD.A02(-1661468390);
        KXh.super.onCreate(bundle);
        this.A00 = C320236s2.A01(requireArguments(), "section_id");
        C60245Ji2 ji2 = (C60245Ji2) this.A03.getValue();
        String str = this.A00;
        if (str == null) {
            0qQ.A0F("sectionId");
            throw AnonymousClass00P.createAndThrow();
        }
        Iterator it = ji2.A06.A02.A04.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((C61220JzD) obj).A03, str)) {
                break;
            }
        }
        C61220JzD jzD = (C61220JzD) obj;
        ji2.A01 = DbW.A1a(jzD);
        if (jzD == null) {
            C61220JzD A002 = LQJ.A00(MediaKitSectionType.ACCOUNTS, str, "");
            String str2 = A002.A03;
            String str3 = A002.A04;
            MediaKitSectionType mediaKitSectionType = A002.A01;
            AnonymousClass7TH.A0K();
            jzD = new C61220JzD((C61219JzC) null, mediaKitSectionType, "", str2, str3, (List) null, (List) null);
        }
        ji2.A00 = jzD;
        05G r7 = ji2.A0B;
        List list = jzD.A05;
        if (list != null) {
            arrayList = AnonymousClass7TG.A0r(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C61036Jva(JTP.A0d(it2), true, true));
            }
        } else {
            arrayList = 0sn.A00;
        }
        r7.Epw(arrayList);
        M1T.A00(ji2.A04.A0C.A09(2EN.A04), ji2.A02, ji2, 8);
        AnonymousClass0fD.A09(1096425238, A022);
    }
}
