package X;

import androidx.fragment.app.Fragment;
import org.json.JSONException;
import org.json.JSONObject;

public final class AXG implements C267624bv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AXG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final /* synthetic */ void CxD() {
        if (this.A00 != 0) {
            AJ9 aj9 = (AJ9) this.A02;
            AnonymousClass0eM r2 = aj9.A0T;
            C314326i1 r0 = (C314326i1) r2.getValue();
            if (r0 == null || !r0.A02()) {
                aj9.A0B = true;
                AJ9.A04(aj9);
                return;
            }
            Fragment fragment = (Fragment) aj9.A0P.get();
            if (fragment != null) {
                07U r5 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = fragment.getViewLifecycleOwner();
                AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r5, aj9, (AnonymousClass4D7) null, 28), AnonymousClass07a.A00(viewLifecycleOwner));
            }
            C314326i1 r02 = (C314326i1) r2.getValue();
            if (r02 != null) {
                r02.A00();
            }
        }
    }

    public final /* synthetic */ void CxF() {
    }

    public final void CxG() {
        int i = this.A00;
        C331157Pu r0 = (C331157Pu) this.A01;
        if (i != 0) {
            r0.A07();
            return;
        }
        r0.A07();
        C342837pF r02 = (C342837pF) this.A02;
        C338857ie r3 = r02.A02;
        if (25x.A00(r02.A01).A01.A00 == C299715vi.A00) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("avatar-event", "avatar-status-did-update");
                r3.ELN(jSONObject);
            } catch (JSONException e) {
                0KC.A0G("AvatarEventHandler", "Error in creating instance of JSONObject for platform event", e);
            }
        }
    }

    public final /* synthetic */ void CxR() {
    }
}
