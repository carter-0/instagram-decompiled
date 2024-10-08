package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.NKj  reason: case insensitive filesystem */
public final class C68490NKj extends MYR {
    public static final String __redex_internal_original_name = "AudiencePickerFragment";
    public C2355930l A00;
    public boolean A01;
    public final AnonymousClass0eM A02 = C73928Pm8.A00(this, 21);
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04 = DbS.A0I(new C73928Pm8(this, 22), new C73928Pm8(this, 23), new C73916Plr(12, (Object) null, this), DbS.A0z(C67738Mtr.class));

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, X.NKj, java.lang.Object, X.MYR] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C73565Pfm.A02(this, DbW.A0E(this), 28);
        AnonymousClass0eM r0 = this.A04;
        Object value = ((C67738Mtr) r0.getValue()).A01.getValue();
        0qQ.A0B(value, 0);
        ((C67738Mtr) r0.getValue()).A02.Epw(value);
    }

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new C68594NOq(this, AnonymousClass7TE.A0l(this.A03), this, AnonymousClass7TF.A1Z(this.A02)));
    }

    public final String getModuleName() {
        return "notes_audience_picker_sheet";
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new C73934PmE(this, 45));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2002) {
            Iterator A1H = C51966G9m.A1H(((C67738Mtr) this.A04.getValue()).A00.getValue());
            int i3 = 0;
            while (true) {
                if (A1H.hasNext()) {
                    if (((NoteAudienceItem) A1H.next()).A00 == NoteAudience.CLOSE_FRIENDS) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            notifyItemChanged(i3);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1934438042);
        C68490NKj.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = new C2355930l(requireActivity(), AnonymousClass7TE.A0l(this.A03));
        this.A01 = C66581MXm.A1V(requireArguments.getBoolean("is_content_note") ? 1 : 0);
        AnonymousClass0fD.A09(2146343825, A022);
    }
}
