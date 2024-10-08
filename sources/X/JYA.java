package X;

import com.facebook.commonavatarliveediting.CdlProviderImpl;
import com.instagram.pendingmedia.service.upload.ImageUploadUtil;
import java.util.Collection;

public final class JYA extends C64101El {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Object A06;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.JYA, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A05;
        Object A002 = A00(obj, this);
        switch (i) {
            case 0:
                return CdlProviderImpl.A00((C62699Kkz) null, (CdlProviderImpl) A002, (String) null, (String) null, this, (0sL) null, 0);
            case 1:
                return AnonymousClass92U.A00((AnonymousClass92U) A002, (AnonymousClass92T) null, (C381739cF) null, this);
            case 2:
                return AnonymousClass93J.A00((AnonymousClass93J) A002, (String) null, (Collection) null, this, 0);
            case 3:
                return ImageUploadUtil.A02((LP8) null, (ImageUploadUtil) A002, this);
            default:
                return C60349Jjw.A00((C60349Jjw) A002, (String) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JYA(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A05 = i;
        this.A06 = obj;
    }

    public static Object A00(Object obj, JYA jya) {
        jya.A04 = obj;
        jya.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return jya.A06;
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof JYA) || ((JYA) obj).A05 != i) {
            return false;
        }
        return true;
    }
}
