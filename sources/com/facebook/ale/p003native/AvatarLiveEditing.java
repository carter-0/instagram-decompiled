package com.facebook.ale.p003native;

import X.0dV;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass7TG;
import X.C17663Vbt;
import X.DbX;
import X.V5U;
import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ale.native.AvatarLiveEditing  reason: invalid package */
public final class AvatarLiveEditing {
    public static final V5U Companion = new Object();
    public final HybridData mHybridData;

    private final native HybridData initHybrid(String str, String str2, String str3, int i, String str4, TigonServiceHolder tigonServiceHolder, TigonServiceHolder tigonServiceHolder2, String str5, String str6, AvatarLiveEditingNotificationDelegate avatarLiveEditingNotificationDelegate, AvatarLiveEditingNetworkInterface avatarLiveEditingNetworkInterface, int i2, int i3, int i4, int i5, int i6);

    public final native void cancelAvatarUpdateRequest(String str);

    public final native void clearAvatarCache();

    public final native void getAlePointerHolder(LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder);

    public final native void prefetchAssets(String str, List list, int i, int i2);

    public final native void prefetchAvatar(String str, Map map);

    public final native void removeNotificationDelegate();

    public final native void requestAvatarUpdate(int i, String str, Map map, boolean z);

    public final native void saveCurrentAvatar();

    public final native void updateAvatarBodyMorphs(String str, Map map);

    public final native void updateAvatarSkeleton(String str, Map map);

    public final native void updateBlendWeights(String str, Map map);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.V5U] */
    static {
        0dV.A0C("ale");
        0dV.A0C("jniperflogger");
    }

    public AvatarLiveEditing(C17663Vbt vbt, AvatarLiveEditingNotificationDelegate avatarLiveEditingNotificationDelegate) {
        int i;
        C17663Vbt vbt2 = vbt;
        AvatarLiveEditingNotificationDelegate avatarLiveEditingNotificationDelegate2 = avatarLiveEditingNotificationDelegate;
        AnonymousClass7TG.A1O(vbt2, avatarLiveEditingNotificationDelegate2);
        String str = vbt2.A06;
        String str2 = vbt2.A07;
        String str3 = vbt2.A08;
        Integer num = vbt2.A03;
        if (1 - (num == null ? AnonymousClass05K.A01 : num).intValue() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        String str4 = vbt2.A04;
        if (str4 != null) {
            this.mHybridData = initHybrid(str, str2, str3, i, str4, vbt2.A00, vbt2.A01, vbt2.A05, (String) null, avatarLiveEditingNotificationDelegate2, (AvatarLiveEditingNetworkInterface) null, DbX.A02(vbt2.A02), -1, -1, -1, -1);
        } else {
            0qQ.A0F("cacheDirectoryUri");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static /* synthetic */ void prefetchAssets$default(AvatarLiveEditing avatarLiveEditing, String str, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        avatarLiveEditing.prefetchAssets(str, list, i, i2);
    }

    public static /* synthetic */ void requestAvatarUpdate$default(AvatarLiveEditing avatarLiveEditing, int i, String str, Map map, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        avatarLiveEditing.requestAvatarUpdate(i, str, map, z);
    }
}
