package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5kg  reason: invalid class name and case insensitive filesystem */
public final class C293405kg extends HashMap<String, String> {
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.containsKey(obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.containsValue(obj);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.get(obj);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (obj == null || (obj instanceof String)) {
            return super.getOrDefault(obj, obj2);
        }
        return obj2;
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.remove(obj);
        }
        return null;
    }

    public C293405kg(Map map) {
        put("sync_fetch_success", map.get("sync_fetch_success"));
        put("sync_fetch_reason", map.get("sync_fetch_reason"));
        put("sync_fetch_failure_reason", map.get("sync_fetch_failure_reason"));
        put("time_elapsed", map.get("time_elapsed"));
        put("prepare_request_latency", map.get("prepare_request_latency"));
        put("network_latency", map.get("network_latency"));
        put("handle_response_latency", map.get("handle_response_latency"));
        put("response_size", map.get("response_size"));
        put("extend_bln_schema", map.get("extend_bln_schema"));
        put("manager_name", map.get("manager_name"));
        put("is_sessionless", map.get("is_sessionless"));
        put("using_partial_fetch", map.get("using_partial_fetch"));
        put("extra_data", map.get("extra_data"));
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

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof String;
        }
        if (!z || (obj2 != null && !(obj2 instanceof String))) {
            return false;
        }
        return super.remove(obj, obj2);
    }
}
