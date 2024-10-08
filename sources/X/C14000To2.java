package X;

import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.instagram.realtimeclient.RealtimeEvent;
import com.instagram.realtimeclient.RealtimeOperation;
import java.util.ArrayList;

/* renamed from: X.To2  reason: case insensitive filesystem */
public final /* synthetic */ class C14000To2 implements AnonymousClass2Kv {
    public final /* synthetic */ 1zJ A00;

    public /* synthetic */ C14000To2(1zJ r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, com.instagram.realtimeclient.RealtimeEvent] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, com.instagram.realtimeclient.RealtimeOperation] */
    public final void invoke(AnonymousClass3JD r9) {
        Object Bny;
        ImmutableList<C250663lr> immutableList;
        1zJ r5 = this.A00;
        if (r9 != null && (Bny = r9.Bny()) != null) {
            C250663lr requiredTreeField = ((C250663lr) Bny).getRequiredTreeField(0, "xdt_direct_realtime_event(input:$input)", UQW.class, 323874593);
            ? obj = new Object();
            String optionalStringField = requiredTreeField.getOptionalStringField(0, "event");
            if (optionalStringField == null) {
                optionalStringField = "";
            }
            obj.type = RealtimeEvent.Type.fromServerValue(optionalStringField);
            obj.operations = new ArrayList();
            Class<UQV> cls = UQV.class;
            if (requiredTreeField.getOptionalCompactedTreeListField(1, "data", cls, 898736254) != null) {
                immutableList = requiredTreeField.getOptionalCompactedTreeListField(1, "data", cls, 898736254);
            } else {
                immutableList = 0sn.A00;
            }
            for (C250663lr r2 : immutableList) {
                ? obj2 = new Object();
                String A07 = r2.A07("op");
                if (A07 == null) {
                    A07 = "";
                }
                obj2.op = RealtimeOperation.Type.valueOf(A07);
                String optionalStringField2 = r2.getOptionalStringField(1, "path");
                if (optionalStringField2 == null) {
                    optionalStringField2 = "";
                }
                obj2.path = optionalStringField2;
                String A09 = r2.A09(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                if (A09 == null) {
                    A09 = "";
                }
                obj2.value = A09;
                obj.operations.add(obj2);
            }
            r5.A04.onRealtimeEvent("/rs_resp", obj);
        }
    }
}
