package X;

import android.content.Context;
import android.graphics.Canvas;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.memories.model.MemoryItem;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8vR  reason: invalid class name and case insensitive filesystem */
public final class C369858vR extends C268694dq implements C41816B1w {
    public final C386019jv A00;
    public final User A01;
    public final int A02;
    public final C387149lk A03;
    public final List A04;

    public final int BRc() {
        return 1;
    }

    public final List A07() {
        return this.A04;
    }

    public final List BRk() {
        return Collections.singletonList(this.A01);
    }

    public final void draw(Canvas canvas) {
        this.A03.draw(canvas);
        this.A00.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        return this.A03.getIntrinsicHeight() + this.A02 + this.A00.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A00.getIntrinsicWidth();
    }

    public C369858vR(Context context, UserSession userSession, MemoryItem memoryItem) {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        User user = memoryItem.A01.A02;
        user.getClass();
        this.A01 = user;
        C386019jv r2 = new C386019jv(context, userSession, user);
        this.A00 = r2;
        C387149lk r0 = new C387149lk(context, userSession, memoryItem, r2.getIntrinsicWidth());
        this.A03 = r0;
        Collections.addAll(arrayList, new C268694dq[]{r0, r2});
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (i + i3) / 2;
        C387149lk r5 = this.A03;
        int intrinsicWidth = r5.getIntrinsicWidth() / 2;
        r5.setBounds(i5 - intrinsicWidth, i2, intrinsicWidth + i5, r5.getIntrinsicHeight() + i2);
        C386019jv r4 = this.A00;
        int intrinsicWidth2 = r4.getIntrinsicWidth() / 2;
        int intrinsicHeight = r5.getIntrinsicHeight() + i2 + this.A02;
        r4.setBounds(i5 - intrinsicWidth2, intrinsicHeight, i5 + intrinsicWidth2, r4.A00 + intrinsicHeight);
    }
}
