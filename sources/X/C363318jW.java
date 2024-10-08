package X;

import android.text.TextUtils;
import com.instagram.user.model.User;
import java.util.BitSet;

/* renamed from: X.8jW  reason: invalid class name and case insensitive filesystem */
public final class C363318jW extends AnonymousClass2FB {
    public final /* bridge */ /* synthetic */ BitSet A00(Object obj, int i) {
        User user = (User) obj;
        BitSet bitSet = new BitSet(30);
        user.getUsername();
        if (user.getUsername().length() > 0) {
            bitSet.set(Character.toLowerCase(user.getUsername().charAt(0)) % 30);
        }
        if (user.getFullName() != null) {
            for (String str : user.getFullName().split(" ")) {
                if (!TextUtils.isEmpty(str)) {
                    bitSet.set(Character.toLowerCase(str.charAt(0)) % 30);
                }
            }
        }
        return bitSet;
    }
}
