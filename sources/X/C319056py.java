package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.6py  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C319056py extends 03J implements 0sL {
    public C319056py(Object obj) {
        super(2, obj, Dc7.class, "onAvatarCoinFlipSettingChanged", "onAvatarCoinFlipSettingChanged(Ljava/lang/String;Ljava/lang/Boolean;)V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        DdZ ddZ = ((UserDetailFragment) this.receiver).A0k;
        if (ddZ != null) {
            ddZ.A04(bool.booleanValue(), (String) null, (String) null, str);
        }
        return C60340gF.A00;
    }
}
