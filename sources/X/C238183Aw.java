package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3Aw  reason: invalid class name and case insensitive filesystem */
public final class C238183Aw extends AnonymousClass1GX {
    public long A00 = -1;
    public Integer A01;
    public final AnonymousClass0JR A02;
    public final 0wc A03;
    public final AnonymousClass4DU A04;
    public final C229122ms A05;
    public final Map A06;

    public final void A00(String str, Integer num, String str2) {
        String str3;
        0qQ.A0B(str2, 1);
        Integer num2 = this.A01;
        if (num2 != null) {
            11Z.A06("This operation must be run on UI thread.");
            if (this.A01 != null && this.A00 != -1) {
                1Ln A0D = 1Ln.A0D(this.A03);
                if (A0D.A00.isSampled()) {
                    long now = this.A02.now();
                    if (1 - num2.intValue() != 0) {
                        str3 = "feed_head_load";
                    } else {
                        str3 = "feed_tail_load";
                    }
                    A0D.A0R(DatePickerDialogModule.ARG_MODE, str3);
                    A0D.A0Q("time_elapsed", Long.valueOf(now - this.A00));
                    A0D.A0n(this.A04.getModuleName());
                    A0D.A0Q("version", 1L);
                    A0D.A0R("ranking_session_id", str);
                    A0D.A0R("reqeust_id", str2);
                    if (num == AnonymousClass05K.A0C) {
                        A0D.A0R("spinner_outcome", "content_loaded");
                        A0D.Cgf();
                    } else {
                        this.A06.put(A0D, Long.valueOf(System.currentTimeMillis()));
                    }
                }
                this.A01 = null;
                this.A00 = -1;
            }
        }
    }

    public C238183Aw(AnonymousClass0JR r3, 0wc r4, AnonymousClass4DU r5, C229122ms r6) {
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A03 = r4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A06 = linkedHashMap;
        14i r0 = 14i.A08;
        14i.A03(15Y.A03, new C238193Ax(new WeakReference(linkedHashMap)));
    }

    public final void onScroll(C238133Ar r6, int i, int i2, int i3, int i4, int i5) {
        int A032 = AnonymousClass0fD.A03(-819299535);
        0qQ.A0B(r6, 0);
        int B6L = r6.B6L();
        int BLQ = r6.BLQ();
        if (B6L <= BLQ) {
            while (true) {
                if (C253923rd.A0B(r6, B6L) == C254183s4.LOAD_MORE) {
                    C229122ms r1 = this.A05;
                    if (r1.isLoading() && r1.CJz()) {
                        Integer num = AnonymousClass05K.A01;
                        11Z.A06("This operation must be run on UI thread.");
                        if (this.A01 == null) {
                            this.A01 = num;
                            this.A00 = this.A02.now();
                        }
                    }
                }
                if (B6L == BLQ) {
                    break;
                }
                B6L++;
            }
        }
        AnonymousClass0fD.A0A(2055303013, A032);
    }
}
