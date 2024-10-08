package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.H0w  reason: case insensitive filesystem */
public final class C54152H0w extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "MemuUploadedPhotosFragment";
    public 2da A00;
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C58672Ivh(this, 31));
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;
    public final View.OnClickListener A04 = new C56800ICx(this, 28);
    public final String A05 = "gen_ai_memu_uploaded_photos";

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
        DbW.A1B(r2, 2131966090);
        A00((C61068Jw6) C51966G9m.A0p(this.A03).A08.getValue(), this);
    }

    public static final void A00(C61068Jw6 jw6, C54152H0w h0w) {
        2da r2 = h0w.A00;
        if (r2 != null) {
            int i = 2131973021;
            if (jw6.A00) {
                i = 2131954722;
            }
            r2.ErE(h0w.A04, i);
            r2.ARb(0, G9w.A1b(jw6.A05));
        }
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean onBackPressed() {
        05G r5 = C51966G9m.A0p(this.A03).A07;
        ArrayList A0U = 00k.A0U((Collection) ((C61068Jw6) r5.getValue()).A05);
        ArrayList A0r = AnonymousClass7TG.A0r(A0U);
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            C46539Dgg dgg = (C46539Dgg) it.next();
            String str = dgg.A01;
            String str2 = dgg.A02;
            AnonymousClass7TF.A1H(str, str2);
            A0r.add(new C46539Dgg(str, str2, 2, false));
        }
        C61068Jw6 jw6 = (C61068Jw6) r5.getValue();
        AnonymousClass62P A002 = AnonymousClass62Q.A00(A0r);
        boolean z = jw6.A01;
        r5.FIA(C61068Jw6.A01((C54650HMh) jw6.A04, (Boolean) jw6.A03, A002, z, false));
        return false;
    }

    public C54152H0w() {
        0Yh A0z = DbS.A0z(C53026GhH.class);
        this.A03 = DbS.A0I(new C58672Ivh(this, 33), new C58672Ivh(this, 34), new C58717IwQ(36, (Object) null, this), A0z);
    }

    public static final void A01(C54152H0w h0w) {
        Activity rootActivity = h0w.getRootActivity();
        if (rootActivity != null) {
            new C56025HrX(rootActivity, AnonymousClass7TE.A0l(h0w.A02)).A01(new C56144HtW(C54678HOj.SETTINGS, (XSJ) null, AnonymousClass05K.A0N, C51972G9s.A0n(), (String) null, (String) null, (String) null, (Map) null, false, true, false), new C57572Icz(h0w, 3));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1261013104);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 13), 146902125);
        AnonymousClass0fD.A09(-85727628, A022);
        return A0H;
    }
}
