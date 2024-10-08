package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Spannable;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import com.instagram.ui.text.CustomUnderlineSpan;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9o9  reason: invalid class name and case insensitive filesystem */
public final class C388639o9 extends AnonymousClass91c {
    public final TimeInterpolator A00 = new OvershootInterpolator(3.0f);
    public final C360728f3 A01 = C360728f3.ROTATING;
    public final List A02 = AnonymousClass7TE.A1C();
    public final List A03 = AnonymousClass7TE.A1C();
    public final List A04 = AnonymousClass7TE.A1C();

    public final int getDurationInMs() {
        return 6000;
    }

    public C388639o9(Context context, int i) {
        super(context, i);
    }

    public final void A0R() {
        C306576Mr r0;
        C358848bZ r13;
        AnonymousClass91R r2;
        super.A0R();
        List list = this.A04;
        list.clear();
        List list2 = this.A02;
        list2.clear();
        List list3 = this.A03;
        list3.clear();
        A0Y();
        Spannable spannable = this.A0F;
        if (spannable != null && spannable.length() != 0) {
            Spannable spannable2 = this.A0F;
            0qQ.A07(spannable2);
            AnonymousClass91R[] r7 = (AnonymousClass91R[]) C263324Kh.A06(spannable2, AnonymousClass91R.class);
            int length = r7.length;
            if (length == 0) {
                r0 = C306576Mr.DISABLED;
            } else {
                r0 = r7[0].A03;
            }
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(this.A0F.toString());
            int i = 0;
            while (true) {
                int next = characterInstance.next();
                if (next == -1) {
                    break;
                }
                C358848bZ[] r132 = (C358848bZ[]) this.A0F.getSpans(i, next, C358848bZ.class);
                Spannable spannable3 = this.A0F;
                0qQ.A0A(r132);
                C358928bh r1 = null;
                if (!AnonymousClass7TF.A1Q(r132.length)) {
                    r13 = r132[0];
                } else {
                    r13 = null;
                }
                if (0 < length && (r2 = r7[0]) != null) {
                    r1 = r2.A09;
                }
                C380259Xg r22 = new C380259Xg(r13, r1);
                0qQ.A0B(r0, 0);
                r22.A01 = r0;
                spannable3.setSpan(r22, i, next, 33);
                i = next;
            }
        }
        Spannable spannable4 = this.A0F;
        0qQ.A07(spannable4);
        if (spannable4.length() != 0) {
            C380259Xg[] r12 = (C380259Xg[]) C263324Kh.A06(spannable4, C380259Xg.class);
            Collections.addAll(list, Arrays.copyOf(r12, r12.length));
            AnonymousClass91R[] r14 = (AnonymousClass91R[]) C263324Kh.A06(spannable4, AnonymousClass91R.class);
            Collections.addAll(list2, Arrays.copyOf(r14, r14.length));
            ViewTreeObserver.OnPreDrawListener[] onPreDrawListenerArr = (ViewTreeObserver.OnPreDrawListener[]) C263324Kh.A06(spannable4, ViewTreeObserver.OnPreDrawListener.class);
            Collections.addAll(list3, Arrays.copyOf(onPreDrawListenerArr, onPreDrawListenerArr.length));
            Spannable spannable5 = this.A0F;
            0qQ.A07(spannable5);
            for (CustomUnderlineSpan customUnderlineSpan : (CustomUnderlineSpan[]) C263324Kh.A06(spannable5, CustomUnderlineSpan.class)) {
                int spanStart = this.A0F.getSpanStart(customUnderlineSpan);
                int spanEnd = this.A0F.getSpanEnd(customUnderlineSpan);
                C358848bZ[] r15 = (C358848bZ[]) this.A0F.getSpans(spanStart, spanEnd, C358848bZ.class);
                int color = this.A0b.getColor();
                0qQ.A0A(r15);
                if (r15.length != 0) {
                    color = r15[0].A05;
                }
                this.A0F.setSpan(new C389939qT(color, AnonymousClass05K.A01), spanStart, spanEnd, 33);
            }
        }
    }
}
