package X;

import android.os.Bundle;
import android.widget.CompoundButton;
import java.util.ArrayList;

/* renamed from: X.ERm  reason: case insensitive filesystem */
public final class C48023ERm extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectSuggestedReplySettingsFragment";
    public OWQ A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131960248);
    }

    public final String getModuleName() {
        return "direct_suggested_reply_settings_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1371115707);
        super.onCreate(bundle);
        OWQ owq = new OWQ(this, AnonymousClass7TE.A0l(this.A01));
        this.A00 = owq;
        OWQ.A00(owq, (C255283ts) null, "suggested_replies_settings_impression", (String) null, AnonymousClass7TE.A1E());
        AnonymousClass0fD.A09(-1047224446, A02);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(1600470716);
        super.onResume();
        AnonymousClass0eM r8 = this.A01;
        AnonymousClass4kA A002 = AnonymousClass4k9.A00(AnonymousClass7TE.A0l(r8));
        ArrayList A1C = AnonymousClass7TE.A1C();
        FGF.A01(A1C, 2131960246);
        if (AnonymousClass7OG.A00(AnonymousClass7TE.A0l(r8))) {
            A1C.add(new PR9((CompoundButton.OnCheckedChangeListener) new FQ1(8, A002, this), (CharSequence) requireContext().getString(2131960245), (CharSequence) requireContext().getString(2131960243), A002.A08()));
        }
        0lg A0X = DbT.A0X(r8);
        0qQ.A0B(A0X, 0);
        0Tu r3 = 0Tu.A06;
        if (DbY.A1Z(r3, A0X, 36315215503101029L) || 182.A06(r3, AnonymousClass7TF.A0L(r8, 0), 36316194755579993L)) {
            A1C.add(new PR9((CompoundButton.OnCheckedChangeListener) new FQ1(9, A002, this), (CharSequence) requireContext().getString(2131960242), (CharSequence) requireContext().getString(2131960241), AnonymousClass7TG.A1a(A002, A002.A0T, AnonymousClass4kA.A0c, 8)));
        }
        setItems(A1C);
        AnonymousClass0fD.A09(-904014890, A02);
    }
}
