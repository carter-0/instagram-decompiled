package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;

/* renamed from: X.NUl  reason: case insensitive filesystem */
public final class C68725NUl extends NJT {
    public static final String __redex_internal_original_name = "EncryptedBackupsPinNuxV2Fragment";
    public final AnonymousClass0eM A00;

    public final String getModuleName() {
        return "encrypted_backups_pin_nux_v2_fragment";
    }

    public final void afterOnViewCreated() {
        String str;
        Integer A02 = C71145Oe2.A02(this);
        Integer A03 = C71145Oe2.A03(this);
        Integer A01 = C71145Oe2.A01(this);
        0qQ.A0B(A02, 0);
        0qQ.A0B(A03, 1);
        NUN nun = ((C67718MtX) this.A00.getValue()).A00;
        nun.A0B("SOFT_BLOCK_PIN_LEADING_SCREEN_IMPRESSION");
        int intValue = A02.intValue();
        if (intValue == 10) {
            str = "THREAD_EXIT";
        } else if (intValue == 11) {
            str = "INBOX_BANNER";
        } else if (intValue == 4) {
            str = "FISHFOODING";
        } else if (intValue != 2) {
            if (intValue == 12) {
                str = "RETRY_PIN";
            }
            nun.A0D("PERIOD", C69893Ntv.A00(A03));
            C66913Mex.A02(nun, A01, "SETUP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        } else {
            str = "SETTINGS";
        }
        nun.A0D("ENTRY_POINT", str);
        nun.A0D("PERIOD", C69893Ntv.A00(A03));
        C66913Mex.A02(nun, A01, "SETUP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
    }

    public C68725NUl() {
        C73663Phc phc = new C73663Phc(this, 25);
        AnonymousClass0eM A03 = NJT.A03(new C73663Phc(this, 22), 0eO.A02, 23);
        this.A00 = DbS.A0I(new C73663Phc(A03, 24), phc, C73915Plq.A00(A03, (Object) null, 3), DbS.A0z(C67718MtX.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(322234296);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_pin_nux_v2, viewGroup, false);
        NJT.A04(inflate, this);
        C3021461u r1 = (C3021461u) AnonymousClass7TF.A0F(inflate, R.id.bottom_buttons);
        C71407Ok6.A02(r1, this, 30);
        NJT.A07(r1, this, 31);
        AnonymousClass0fD.A09(-203374183, A02);
        return inflate;
    }
}
