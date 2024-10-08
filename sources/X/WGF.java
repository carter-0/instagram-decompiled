package X;

import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class WGF implements X5r {
    public final /* synthetic */ int A00;
    public final /* synthetic */ W3O A01;
    public final /* synthetic */ VLM A02;
    public final /* synthetic */ List A03;

    public WGF(W3O w3o, VLM vlm, List list, int i) {
        this.A01 = w3o;
        this.A03 = list;
        this.A02 = vlm;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ void Dos(Bundle bundle, Object obj) {
        W3O w3o = this.A01;
        List unmodifiableList = Collections.unmodifiableList(this.A03);
        C15250UXk uXk = ((C17211VMp) obj).A00;
        String str = uXk.A01;
        if (str != null) {
            w3o.A08 = str;
            C17704VcZ vcZ = w3o.A0O;
            C17624VbG vbG = uXk.A00;
            vcZ.A00 = JTP.A09(vbG.A00);
            vcZ.A01 = JTP.A09(vbG.A01);
            vcZ.A02 = JTP.A09(vbG.A02);
            vcZ.A03 = JTP.A09(vbG.A05);
            0qQ.A0A(vbG.A03);
            0qQ.A0A(vbG.A04);
            vcZ.A04 = (long) JTP.A09(vbG.A06);
            boolean z = uXk.A03;
            if (!z) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                for (C17336VRp vRp : uXk.A02) {
                    String str2 = vRp.A01;
                    0qQ.A0A(str2);
                    String str3 = vRp.A00;
                    0qQ.A0A(str3);
                    if (str2 != null && !str2.isEmpty() && !hashSet.contains(str2)) {
                        hashSet.add(str2);
                        VUY vuy = new VUY(Long.parseLong(str2), str3);
                        vuy.A00 = AnonymousClass05K.A00;
                        arrayList.add(vuy);
                    }
                }
                S0I s0i = w3o.A0U;
                ((SQLiteOpenHelper) s0i.A00).getWritableDatabase().delete(Pxd.A00(203), (String) null, (String[]) null);
                s0i.A00(arrayList);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("in_sync", z);
            bundle2.putBoolean("full_upload", false);
            C18038VkM vkM = w3o.A0V;
            bundle2.putString("root_hash", vkM.A01());
            bundle2.putInt("processed_contact_count", w3o.A02);
            bundle2.putLong("last_upload_success_time", vkM.A00());
            C13989Tnp.A15(bundle2, w3o);
            bundle2.putInt("num_of_retries", w3o.A04);
            bundle2.putString("ccu_session_id", w3o.A08);
            bundle2.putString("family_device_id", (String) null);
            for (X9S D6u : w3o.A0Q.A01) {
                D6u.D6u(bundle2);
            }
            w3o.A0U.A00(unmodifiableList);
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putString(TraceFieldType.FailureReason, "create_session_fail");
            bundle3.putInt("num_of_retries", w3o.A04);
            bundle3.putString("failure_message", "create session result is null");
            C17790Vg2 vg2 = w3o.A0Q;
            W3O.A01(bundle3, w3o);
            for (X9S D6t : vg2.A01) {
                D6t.D6t(bundle3);
            }
            w3o.A0S.A02(false, "create_session_invalid_response");
        }
        W3O.A04(w3o);
    }

    public final void onFailure(Throwable th) {
        Bundle bundle = new Bundle();
        bundle.putString(TraceFieldType.FailureReason, "create_session_fail");
        bundle.putString("failure_message", th.getMessage());
        W3O w3o = this.A01;
        bundle.putBoolean("full_upload", false);
        bundle.putInt("num_of_retries", w3o.A04);
        bundle.putString("family_device_id", (String) w3o.A0P.A00.get());
        C17790Vg2 vg2 = w3o.A0Q;
        W3O.A01(bundle, w3o);
        for (X9S D6t : vg2.A01) {
            D6t.D6t(bundle);
        }
        int i = w3o.A04 - 1;
        w3o.A04 = i;
        if (i >= 0) {
            W3O.A05(w3o, this.A02, this.A03, this.A00);
            return;
        }
        w3o.A0S.A01(TraceFieldType.FailureReason, AnonymousClass7TF.A0m("Session create failed with ", th));
        W3O.A04(w3o);
    }
}
