package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: X.SHm  reason: case insensitive filesystem */
public final class C11252SHm {
    public QC2 A00;
    public RRP A01;
    public Integer A02 = null;
    public Long A03 = null;
    public List A04;
    public boolean A05;
    public final WeakReference A06;
    public final Handler A07;

    public static int A00(QC2 qc2, String str) {
        Integer num;
        String str2;
        if (qc2 == null) {
            int hashCode = str.hashCode();
            if (hashCode != -1459274090) {
                if (hashCode == 161743991) {
                    str2 = "BLOKS_HYBRID_PAYMENT_USAGE";
                }
                num = AnonymousClass05K.A0C;
            } else {
                str2 = "BLOKS_PAYMENT_USAGE";
            }
            if (str.equals(str2)) {
                num = AnonymousClass05K.A0N;
            }
            num = AnonymousClass05K.A0C;
        } else if ((qc2 instanceof QKG) || (qc2 instanceof QKJ)) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        switch (num.intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 3;
        }
    }

    public final synchronized void A01(Context context, C11288SJh sJh, C270254gR r43, QC2 qc2, RRP rrp, Integer num, Integer num2, String str, List list) {
        int A002;
        Integer num3;
        C7580QKv A0Q;
        String str2;
        Dialog dialog;
        synchronized (this) {
            Long l = this.A03;
            QC2 qc22 = qc2;
            String str3 = str;
            if (l == null) {
                this.A03 = Long.valueOf(SystemClock.elapsedRealtime());
                A002 = A00(qc22, str3);
            } else {
                A002 = A00(qc22, str3);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long longValue = elapsedRealtime - l.longValue();
                if (!(longValue >= 1000 || (num3 = this.A02) == null || (A0Q = Pxe.A0Q(this.A06)) == null)) {
                    int i = (int) longValue;
                    int intValue = num3.intValue();
                    C61038Jvc jvc = A0Q.A0b.A00.A0P;
                    String str4 = jvc.A02;
                    String str5 = jvc.A03;
                    Bundle A022 = A0Q.A02();
                    0qQ.A0B(str4, 0);
                    if (intValue == 0 || intValue == 2) {
                        if (intValue == A002) {
                            str2 = "MERGE_AUTOFILL_DIALOG_INTERVAL_CONTACT";
                        } else {
                            str2 = "MERGE_AUTOFILL_DIALOG_INTERVAL_CONTACT_PAYMENT";
                        }
                    } else if (intValue != 1 && intValue != 3) {
                        str2 = "MERGE_AUTOFILL_DIALOG_INTERVAL";
                    } else if (intValue == A002) {
                        str2 = "MERGE_AUTOFILL_DIALOG_INTERVAL_PAYMENT";
                    } else {
                        str2 = "MERGE_AUTOFILL_DIALOG_INTERVAL_PAYMENT_CONTACT";
                    }
                    SRY.A00().A07(A022, new C11265SHz((Long) null, str2, str4, (String) null, (String) null, (String) null, (String) null, (String) null, str5, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, (Map) null, 0, i, 0, 0, false, false, false, false).A01());
                }
                this.A03 = Long.valueOf(elapsedRealtime);
            }
            this.A02 = Integer.valueOf(A002);
            QC2 qc23 = this.A00;
            C11288SJh sJh2 = sJh;
            Integer num4 = num;
            if (qc23 == null || (dialog = qc23.A01) == null || !dialog.isShowing() || this.A00.mRemoving) {
                RRP rrp2 = rrp;
                Integer num5 = num2;
                if (!this.A05) {
                    this.A05 = true;
                    List list2 = this.A04;
                    list2.clear();
                    list2.add(new C10728Rx6(qc22, rrp2, num5, str3));
                    C11288SJh sJh3 = sJh2;
                    this.A07.postDelayed(new C13079TKl(context, this, sJh3, r43, qc22, rrp2, num4, str3, list), 200);
                } else {
                    this.A04.add(new C10728Rx6(qc22, rrp2, num5, str3));
                }
            } else {
                sJh2.A03(num4, "prompt_name", "NO_PROMPTED_AUTOFILL", 772805755);
                sJh2.A01(num4, (Long) null, 772805755);
            }
        }
    }

    public C11252SHm(WeakReference weakReference) {
        this.A06 = weakReference;
        this.A05 = false;
        this.A04 = AnonymousClass7TE.A1C();
        this.A07 = AnonymousClass7TF.A0D();
    }
}
