package X;

import android.content.DialogInterface;
import com.instagram.react.modules.base.IgReactQEModule;

public final class I9B implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public I9B(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Object value;
        AnonymousClass7PG r2;
        C55948HqC hqC;
        switch (this.A00) {
            case 0:
                ((C52971GgO) this.A01).A03 = false;
                return;
            case 1:
                DbS.A1U(this.A01);
                return;
            case 2:
                C333317Ym r5 = (C333317Ym) ((C3027965h) this.A01).A01.getValue();
                05G r6 = r5.A06;
                do {
                    value = r6.getValue();
                    r2 = (AnonymousClass7PG) value;
                } while (!C51975G9x.A1W(r2.A00, AnonymousClass7PF.NONE, r2, value, r6));
                String str = r5.A00;
                if (str != null) {
                    0xa r22 = r5.A05.A01;
                    DbW.A1L(r22.AR4(), 002.A0R("has_seen_per_creator_ai_beta_disclosure/", str));
                    0xY AR4 = r22.AR4();
                    AR4.E5c(AnonymousClass000.A00(1541), System.currentTimeMillis());
                    AR4.apply();
                    r5.A00 = null;
                    return;
                }
                return;
            case 3:
            case 4:
                C56911IHg iHg = (C56911IHg) this.A01;
                C227282ix r1 = iHg.A09;
                if (r1 != null) {
                    r1.D0t(iHg.A0E);
                }
                iHg.A03.onDismiss(dialogInterface);
                return;
            case 5:
                ((C55784HnJ) this.A01).A02.EHd();
                return;
            case 6:
                ((C59631JQz) this.A01).DdU();
                return;
            case 7:
                0xY A0p = AnonymousClass7TE.A0p(1Au.A00(((C53081GiF) this.A01).A07));
                A0p.E5T("has_seen_share_to_direct_dialog_from_draft", true);
                A0p.apply();
                return;
            case 8:
                hqC = ((C52035GCh) this.A01).A05;
                break;
            case 9:
                GBE gbe = ((I4M) this.A01).A0D.A00.A09;
                if (gbe == null) {
                    0qQ.A0F("clipsViewerFragmentViewModel");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    gbe.A0H();
                    return;
                }
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                hqC = ((C52033GCf) this.A01).A0E;
                break;
            case 13:
                hqC = ((C52034GCg) this.A01).A0H;
                break;
            default:
                hqC = ((C52036GCi) this.A01).A03;
                break;
        }
        hqC.A00();
    }
}
