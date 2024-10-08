package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Ua2  reason: case insensitive filesystem */
public abstract class C15296Ua2 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenAdvancedSettingsBaseFragment";
    public C262204Co A00;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        C13992Tns.A0r(r2, 2131964753);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        U8S A002 = A00();
        VOH voh = A002.A00;
        if (A002 instanceof C16036UnP) {
            str = ((C16036UnP) A002).A02;
        } else {
            str = ((C16035UnO) A002).A02;
        }
        0qQ.A0B(str, 0);
        XB6.A02(voh.A00, str, "lead_gen_advanced_setting", "advanced_setting_screen_impression");
        WB9.A00(view.requireViewById(R.id.form_name_clickable_area), 52, this);
        TextView A0G = DbU.A0G(view, R.id.form_name_text);
        U8S A003 = A00();
        if (A003 instanceof C16036UnP) {
            str2 = ((C16036UnP) A003).A01.A04;
        } else {
            str2 = ((C16035UnO) A003).A00.A1N;
            0qQ.A06(str2);
        }
        A0G.setText(str2);
    }

    public final U8S A00() {
        AnonymousClass0eM r0;
        if (this instanceof C15995Umc) {
            r0 = ((C15995Umc) this).A00;
        } else {
            r0 = ((C15994Umb) this).A00;
        }
        return (U8S) r0.getValue();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        U8S A002 = A00();
        if (A002 instanceof C16036UnP) {
            return ((C16036UnP) A002).A00;
        }
        return ((C16035UnO) A002).A01;
    }

    public final boolean onBackPressed() {
        String str;
        U8S A002 = A00();
        VOH voh = A002.A00;
        if (A002 instanceof C16036UnP) {
            str = ((C16036UnP) A002).A02;
        } else {
            str = ((C16035UnO) A002).A02;
        }
        0qQ.A0B(str, 0);
        XB6.A01(voh.A00, str, "lead_gen_advanced_setting", "cancel");
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1481709357);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_advanced_settings, viewGroup, false);
        AnonymousClass0fD.A09(352504896, A02);
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.fragment.app.Fragment, X.Ua2] */
    public final void onStart() {
        int A02 = AnonymousClass0fD.A02(1348356583);
        C15296Ua2.super.onStart();
        this.A00 = C20592WvV.A00(this, A00().A02, 11);
        AnonymousClass0fD.A09(1490952239, A02);
    }

    public final void onStop() {
        int A02 = AnonymousClass0fD.A02(826989659);
        C15296Ua2.super.onStop();
        this.A00 = JTQ.A0n(this.A00);
        AnonymousClass0fD.A09(-1284722311, A02);
    }
}
