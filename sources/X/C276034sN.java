package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.4sN  reason: invalid class name and case insensitive filesystem */
public final class C276034sN implements AnonymousClass2Kv {
    public final /* synthetic */ 1xi A00;
    public final /* synthetic */ QuickPerformanceLogger A01;

    public C276034sN(1xi r1, QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = r1;
        this.A01 = quickPerformanceLogger;
    }

    public final void invoke(AnonymousClass3JD r14) {
        String str;
        QuickPerformanceLogger quickPerformanceLogger;
        C250663lr r9;
        ImmutableList requiredCompactedTreeListField;
        C250663lr r5;
        QuickPerformanceLogger quickPerformanceLogger2;
        C250663lr r52;
        C250663lr optionalTreeField;
        String str2 = null;
        if (r14 == null || (r52 = (C250663lr) r14.Bny()) == null || (optionalTreeField = r52.getOptionalTreeField(0, "xfb_init_push_healthcheck(data:{\"app_id\":$app_id,\"device_id\":$device_id})", BWQ.class, -51376335)) == null) {
            str = null;
        } else {
            str = optionalTreeField.getOptionalStringField(0, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        }
        if (0qQ.A0K(str, "TokenNotFound")) {
            QuickPerformanceLogger quickPerformanceLogger3 = this.A01;
            if (quickPerformanceLogger3 != null) {
                quickPerformanceLogger3.markerAnnotate(875301323, "error_message", "Token not found for app/device/user by pushability healthcheck mutation");
                quickPerformanceLogger3.markerEnd(875301323, 3);
                return;
            }
            return;
        }
        if (!(r14 == null || (r9 = (C250663lr) r14.Bny()) == null)) {
            Class<BWQ> cls = BWQ.class;
            C250663lr optionalTreeField2 = r9.getOptionalTreeField(0, "xfb_init_push_healthcheck(data:{\"app_id\":$app_id,\"device_id\":$device_id})", cls, -51376335);
            if (!(optionalTreeField2 == null || (requiredCompactedTreeListField = optionalTreeField2.getRequiredCompactedTreeListField(1, "push_delivery_results", BWP.class, 461710326)) == null || (r5 = (C250663lr) 00k.A0J(requiredCompactedTreeListField)) == null || (quickPerformanceLogger2 = this.A01) == null)) {
                String A002 = AnonymousClass000.A00(3822);
                quickPerformanceLogger2.markerAnnotate(875301323, A002, r5.getOptionalStringField(0, A002));
                quickPerformanceLogger2.markerAnnotate(875301323, "error_message", r5.getOptionalStringField(2, "error_message"));
                quickPerformanceLogger2.markerAnnotate(875301323, TraceFieldType.ErrorCode, r5.getOptionalStringField(1, TraceFieldType.ErrorCode));
            }
            C250663lr optionalTreeField3 = r9.getOptionalTreeField(0, "xfb_init_push_healthcheck(data:{\"app_id\":$app_id,\"device_id\":$device_id})", cls, -51376335);
            if (optionalTreeField3 != null) {
                str2 = optionalTreeField3.getOptionalStringField(0, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
            }
        }
        if (0qQ.A0K(str2, "Success") && (quickPerformanceLogger = this.A01) != null) {
            quickPerformanceLogger.markerPoint(875301323, "initiate_pushability_check_mutation_success");
        }
    }
}
