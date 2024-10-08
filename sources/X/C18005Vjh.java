package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: X.Vjh  reason: case insensitive filesystem */
public final class C18005Vjh {
    public ColorStateList A00 = null;
    public PorterDuff.Mode A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04;
    public final CompoundButton A05;

    public final void A00() {
        CompoundButton compoundButton = this.A05;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable == null) {
            return;
        }
        if (this.A02 || this.A03) {
            Drawable mutate = buttonDrawable.mutate();
            if (this.A02) {
                mutate.setTintList(this.A00);
            }
            if (this.A03) {
                mutate.setTintMode(this.A01);
            }
            if (mutate.isStateful()) {
                C13988Tno.A0x(mutate, compoundButton);
            }
            compoundButton.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|(2:6|7)|8|9|(1:13)|14|(1:16)|17|(1:19)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r6 = r10.A05
            android.content.Context r3 = r6.getContext()
            int[] r7 = X.AnonymousClass2Z3.A0C
            r9 = 0
            r5 = r11
            r8 = r12
            X.2Yi r2 = X.2Yi.A00(r3, r11, r7, r12, r9)
            android.content.res.TypedArray r4 = r2.A02
            X.03v.A06(r3, r4, r5, r6, r7, r8, r9)
            r1 = 1
            boolean r0 = r4.hasValue(r1)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0029
            int r0 = r4.getResourceId(r1, r9)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0029
            android.graphics.drawable.Drawable r0 = X.C323656xt.A00(r3, r0)     // Catch:{ NotFoundException -> 0x0029 }
            r6.setButtonDrawable(r0)     // Catch:{ NotFoundException -> 0x0029 }
            goto L_0x003c
        L_0x0029:
            boolean r0 = r4.hasValue(r9)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x003c
            int r0 = r4.getResourceId(r9, r9)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x003c
            android.graphics.drawable.Drawable r0 = X.C323656xt.A00(r3, r0)     // Catch:{ all -> 0x0062 }
            r6.setButtonDrawable(r0)     // Catch:{ all -> 0x0062 }
        L_0x003c:
            r1 = 2
            boolean r0 = r4.hasValue(r1)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x004a
            android.content.res.ColorStateList r0 = r2.A01(r1)     // Catch:{ all -> 0x0062 }
            r6.setButtonTintList(r0)     // Catch:{ all -> 0x0062 }
        L_0x004a:
            r1 = 3
            boolean r0 = r4.hasValue(r1)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x005e
            r0 = -1
            int r1 = r4.getInt(r1, r0)     // Catch:{ all -> 0x0062 }
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass3NX.A00(r0, r1)     // Catch:{ all -> 0x0062 }
            r6.setButtonTintMode(r0)     // Catch:{ all -> 0x0062 }
        L_0x005e:
            r4.recycle()
            return
        L_0x0062:
            r0 = move-exception
            r4.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18005Vjh.A01(android.util.AttributeSet, int):void");
    }

    public C18005Vjh(CompoundButton compoundButton) {
        this.A05 = compoundButton;
    }
}
