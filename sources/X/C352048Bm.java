package X;

import com.instagram.ui.text.TextColorScheme;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.8Bm  reason: invalid class name and case insensitive filesystem */
public final class C352048Bm {
    public int A00 = -1;
    public int A01 = -1;
    public TextColorScheme A02;
    public TextColorScheme A03 = null;
    public final Deque A04;
    public final List A05;

    public final void A00() {
        Deque deque = this.A04;
        Object poll = deque.poll();
        poll.getClass();
        TextColorScheme textColorScheme = (TextColorScheme) poll;
        deque.offer(textColorScheme);
        this.A02 = textColorScheme;
        this.A00 = (this.A00 + 1) % deque.size();
    }

    public final void A01() {
        if (this.A03 != null) {
            boolean z = false;
            if (this.A01 != -1) {
                z = true;
            }
            17k.A0E(z);
            Deque deque = this.A04;
            deque.remove(this.A03);
            int i = this.A01;
            int i2 = this.A00;
            if (i <= i2) {
                this.A00 = ((i2 - 1) + deque.size()) % deque.size();
            }
            this.A01 = -1;
            this.A03 = null;
        }
    }

    public final void A02(int... iArr) {
        TextColorScheme textColorScheme = this.A02;
        textColorScheme.getClass();
        A01();
        if (iArr.length == 1) {
            int i = iArr[0];
            iArr = new int[]{i, i};
        }
        TextColorScheme A002 = textColorScheme.A00(iArr);
        this.A03 = A002;
        Deque deque = this.A04;
        deque.push(A002);
        this.A01 = (this.A00 + 1) % deque.size();
    }

    public C352048Bm(List list, int[] iArr, int i, int i2) {
        int i3;
        17k.A0E(!list.isEmpty());
        this.A05 = list;
        this.A04 = new LinkedList();
        if (i2 == 0) {
            i3 = list.size() - 1;
        } else {
            i3 = i2 - 1;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (i4 == i2) {
                int i5 = iArr[0];
                TextColorScheme A002 = ((TextColorScheme) list.get(i3)).A00(i5, i5);
                this.A03 = A002;
                Deque deque = this.A04;
                deque.offer(A002);
                this.A01 = deque.size() - 1;
            }
            this.A04.offer(list.get(i4));
        }
        if (i2 == list.size()) {
            int i6 = iArr[0];
            TextColorScheme A003 = ((TextColorScheme) list.get(i3)).A00(i6, i6);
            this.A03 = A003;
            Deque deque2 = this.A04;
            deque2.offer(A003);
            this.A01 = deque2.size() - 1;
        }
        for (int i7 = 0; i7 < i; i7++) {
            Deque deque3 = this.A04;
            Object poll = deque3.poll();
            poll.getClass();
            TextColorScheme textColorScheme = (TextColorScheme) poll;
            deque3.offer(textColorScheme);
            this.A02 = textColorScheme;
            this.A00 = (this.A00 + 1) % deque3.size();
        }
    }
}
