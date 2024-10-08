package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.memories.model.MemoryItem;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9lk  reason: invalid class name and case insensitive filesystem */
public final class C387149lk extends C369868vS {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C387149lk(android.content.Context r12, com.instagram.common.session.UserSession r13, com.instagram.reels.memories.model.MemoryItem r14, int r15) {
        /*
            r11 = this;
            r3 = r12
            java.lang.String r5 = A01(r12, r14)
            r4 = r13
            java.lang.String r6 = A00(r12, r13, r14)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131165259(0x7f07004b, float:1.794473E38)
            int r8 = r1.getDimensionPixelSize(r0)
            X.Kho r1 = r14.A00
            X.Kho r0 = X.C62558Kho.FRIENDSHIP_CREATION
            if (r1 != r0) goto L_0x003b
            android.content.res.Resources r0 = r12.getResources()
            int r9 = X.AnonymousClass7TE.A0C(r0)
        L_0x0023:
            int r10 = X.AnonymousClass7TH.A01(r12)
            r2 = r11
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            X.6Ly r2 = r11.A01
            X.AnonymousClass7TG.A1N(r12, r2)
            X.0qq r1 = X.AnonymousClass0qo.A00(r12)
            X.0qm r0 = X.0qm.A12
            X.AnonymousClass7TE.A1X(r0, r1, r2)
            return
        L_0x003b:
            r9 = 0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387149lk.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.reels.memories.model.MemoryItem, int):void");
    }

    public static String A00(Context context, UserSession userSession, MemoryItem memoryItem) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int ordinal = memoryItem.A00.ordinal();
        if (ordinal == 1 || ordinal == 0) {
            1Xj r2 = memoryItem.A01.A01;
            r2.getClass();
            User A2A = r2.A2A(userSession);
            A2A.getClass();
            if (A2A.equals(AnonymousClass0t1.A01.A01(userSession))) {
                List A3d = r2.A3d();
                if (A3d != null) {
                    A1C.addAll(A3d);
                }
            } else {
                A1C.add(r2.A2A(userSession));
            }
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                spannableStringBuilder.setSpan(new AnonymousClass91O(context.getResources(), (User) it.next()), 0, 0, 18);
            }
        } else if (ordinal == 2) {
            User user = memoryItem.A01.A02;
            A1C.add(user);
            Resources resources = context.getResources();
            user.getClass();
            spannableStringBuilder.append(AnonymousClass7TF.A0e(resources, user.getUsername(), 2131962790));
            C253003q3 r1 = new C253003q3(spannableStringBuilder, userSession);
            r1.A0L = true;
            r1.A01 = -1;
            r1.A03((C253023q5) null);
            r1.A00();
        }
        return spannableStringBuilder.toString();
    }

    public static String A01(Context context, MemoryItem memoryItem) {
        int i = Calendar.getInstance().get(1);
        int ordinal = memoryItem.A00.ordinal();
        if (ordinal == 1 || ordinal == 0) {
            Calendar instance = Calendar.getInstance();
            1Xj r0 = memoryItem.A01.A01;
            r0.getClass();
            instance.setTimeInMillis(r0.A1A() * 1000);
            i = instance.get(1);
        } else if (ordinal == 2) {
            i = memoryItem.A01.A00;
        }
        int i2 = Calendar.getInstance().get(1) - i;
        return context.getResources().getQuantityString(R.plurals.canvas_memories_sticker_title_text, i2, AnonymousClass7TF.A1b(i2));
    }
}
