package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.Ave  reason: case insensitive filesystem */
public final class C41536Ave extends LinkedHashMap<AnonymousClass6MW, String> {
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof AnonymousClass6MW)) {
            return false;
        }
        return super.containsKey(obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof AnonymousClass6MW)) {
            return null;
        }
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof AnonymousClass6MW)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof AnonymousClass6MW) || !(obj2 instanceof String)) {
            return false;
        }
        return super.remove(obj, obj2);
    }

    public C41536Ave(UserSession userSession) {
        put(AnonymousClass6MW.A06, "mention_sticker_redesign_default");
        put(AnonymousClass6MW.A0B, "mention_sticker_redesign_subtle");
        put(AnonymousClass6MW.A0A, "mention_sticker_redesign_rainbow");
        put(AnonymousClass6MW.A07, "mention_sticker_redesign_hero");
        put(AnonymousClass6MW.A0C, "mention_sticker_redesign_vibrant");
        put(AnonymousClass6MW.A09, "mention_sticker_redesign_monotone");
        if (182.A06(0Tu.A05, userSession, 36327782577355457L)) {
            put(AnonymousClass6MW.A08, C273654mx.A00(157));
        }
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof AnonymousClass6MW)) {
            return null;
        }
        return super.remove(obj);
    }
}
