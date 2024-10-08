package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.2q4  reason: invalid class name and case insensitive filesystem */
public final class C230712q4 implements C250603lj {
    public static final Long A06 = 2L;
    public Queue A00;
    public boolean A01;
    public final 0wc A02;
    public final C230692q2 A03;
    public final AnonymousClass4DU A04;
    public final AnonymousClass2q5 A05 = new AnonymousClass2q5();

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0lV, java.lang.Object, X.2q6] */
    public C230712q4(0wc r5, C230692q2 r6, AnonymousClass4DU r7) {
        LinkedList linkedList = new LinkedList();
        this.A00 = linkedList;
        this.A01 = false;
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = r6;
        14i r2 = 14i.A08;
        ? obj = new Object();
        obj.A01 = linkedList;
        obj.A00 = new WeakReference(this);
        r2.A0A(obj);
    }

    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        String str;
        Integer num;
        int intValue = r10.CEk(r9).intValue();
        if (intValue == 0 || intValue == 1) {
            AnonymousClass2q5 r2 = this.A05;
            this.A01 = false;
            if (r10.CFe(r9) >= 0.5f && r2.A00 <= -1) {
                C228472lj r3 = this.A03.A04;
                r2.A01 = (long) r3.A00;
                String str2 = "";
                String str3 = r3.A0J;
                if (str3 == null) {
                    str3 = str2;
                }
                r2.A04 = str3;
                String str4 = r3.A0I;
                if (str4 != null) {
                    str2 = str4;
                }
                r2.A03 = str2;
                r2.A00 = r10.BlK();
                if (!"feed_timeline".equals(this.A04.getModuleName()) || !r3.A0M) {
                    str = "feed_tail_load";
                } else {
                    str = "feed_head_load_streaming";
                }
                r2.A02 = str;
            }
            long BlK = r10.BlK() - r2.A00;
            C230692q2 r5 = this.A03;
            if ((!182.A06(0Tu.A05, r5.A02, 36322976508947152L) || r2.A02.equals("feed_tail_load")) && BlK >= 250) {
                C229132mt r0 = r5.A01;
                if (r0 != null) {
                    r0.ACw();
                }
                r5.A03.ACw();
                return;
            }
            return;
        }
        AnonymousClass2q5 r4 = this.A05;
        long j = r4.A00;
        if (j != -1) {
            long BlK2 = r10.BlK() - j;
            r4.A00 = -1;
            if (BlK2 >= 250 && ((C229122ms) r9.A03).CJz()) {
                1Ln A0D = 1Ln.A0D(this.A02);
                if (A0D.A00.isSampled()) {
                    if (this.A01) {
                        num = AnonymousClass05K.A00;
                    } else {
                        num = AnonymousClass05K.A0C;
                    }
                    A0D.A0R(DatePickerDialogModule.ARG_MODE, r4.A02);
                    A0D.A0Q("time_elapsed", Long.valueOf(BlK2));
                    A0D.A0n(this.A04.getModuleName());
                    A0D.A0Q("version", A06);
                    A0D.A0Q("spinner_position", Long.valueOf(r4.A01));
                    A0D.A0R("ranking_session_id", r4.A03);
                    A0D.A0R("reqeust_id", r4.A04);
                    if (num == AnonymousClass05K.A0C) {
                        A0D.A0R("spinner_outcome", "content_loaded");
                        A0D.Cgf();
                    } else {
                        Queue queue = this.A00;
                        synchronized (queue) {
                            queue.add(A0D);
                        }
                        new Handler(Looper.getMainLooper()).postDelayed(new C40902AlA(this), 10000);
                    }
                }
                this.A01 = false;
            }
        }
    }
}
