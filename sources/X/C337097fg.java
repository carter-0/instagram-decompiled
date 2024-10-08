package X;

import com.facebook.ui.emoji.model.BasicEmoji;
import com.facebook.ui.emoji.model.Emoji;
import com.instagram.ui.emoji.EmojiSkinTone$createVariations$baseEmoji$1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7fg  reason: invalid class name and case insensitive filesystem */
public abstract class C337097fg {
    public static final boolean A01(C317486nL r4, C317486nL r5) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        String str = r4.A02;
        String str2 = r5.A02;
        int[] A02 = Emoji.A02();
        int A01 = Emoji.A01(A02, Emoji.A00(str, A02), true);
        int[] A022 = Emoji.A02();
        if (A01 == Emoji.A01(A022, Emoji.A00(str2, A022), true)) {
            int i = 0;
            while (i < A01) {
                try {
                    if (A02[i] == A022[i]) {
                        i++;
                    }
                } catch (Throwable th) {
                    0l2 r0 = Emoji.A01;
                    r0.ECR(A02);
                    r0.ECR(A022);
                    throw th;
                }
            }
            0l2 r02 = Emoji.A01;
            r02.ECR(A02);
            r02.ECR(A022);
            return true;
        }
        0l2 r03 = Emoji.A01;
        r03.ECR(A02);
        r03.ECR(A022);
        return false;
    }

    public static final C317486nL[] A02(String str, boolean z) {
        List<Emoji> list;
        int i;
        String str2;
        0qQ.A0B(str, 0);
        EmojiSkinTone$createVariations$baseEmoji$1 emojiSkinTone$createVariations$baseEmoji$1 = null;
        if (z) {
            emojiSkinTone$createVariations$baseEmoji$1 = new EmojiSkinTone$createVariations$baseEmoji$1(str);
        }
        int[] A02 = Emoji.A02();
        int A00 = Emoji.A00(str, A02);
        if (A00 <= 1 || (i = A02[1]) < 127995 || i > 127999) {
            int A002 = C337107fh.A00(A02, A00);
            if (A002 < 0) {
                Emoji.A01.ECR(A02);
                if (emojiSkinTone$createVariations$baseEmoji$1 == null) {
                    list = Collections.emptyList();
                } else {
                    list = Collections.singletonList(emojiSkinTone$createVariations$baseEmoji$1);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                if (emojiSkinTone$createVariations$baseEmoji$1 != null) {
                    arrayList.add(emojiSkinTone$createVariations$baseEmoji$1);
                }
                int i2 = 127995;
                do {
                    A02[1] = i2;
                    arrayList.add(new BasicEmoji(new String(A02, 0, A002)));
                    i2++;
                } while (i2 != 128000);
                Emoji.A01.ECR(A02);
                list = Collections.unmodifiableList(arrayList);
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (emojiSkinTone$createVariations$baseEmoji$1 != null) {
                if (A00 <= 2) {
                    str2 = new String(A02, 0, 1);
                } else {
                    int i3 = A00 - 2;
                    System.arraycopy(A02, 2, A02, 1, i3);
                    str2 = new String(A02, 0, A00 - 1);
                    System.arraycopy(A02, 1, A02, 2, i3);
                }
                arrayList2.add(new BasicEmoji(str2));
            }
            int i4 = 127995;
            do {
                A02[1] = i4;
                arrayList2.add(new BasicEmoji(new String(A02, 0, A00)));
                i4++;
            } while (i4 != 128000);
            Emoji.A01.ECR(A02);
            list = arrayList2;
        }
        0qQ.A07(list);
        ArrayList arrayList3 = new ArrayList(0Yv.A1E(list, 10));
        for (Emoji A03 : list) {
            String A032 = A03.A03();
            0qQ.A07(A032);
            arrayList3.add(new C317486nL(A032, -1));
        }
        return (C317486nL[]) arrayList3.toArray(new C317486nL[0]);
    }

    public static final boolean A00(C317486nL r1) {
        if (C337107fh.A01(r1.A02)) {
            return true;
        }
        return false;
    }
}
