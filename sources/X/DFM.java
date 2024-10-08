package X;

import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.DayOfTheWeek;
import java.util.ArrayList;
import java.util.Iterator;

public final class DFM implements AnonymousClass2Kv {
    public final /* synthetic */ 2MN A00;

    public DFM(2MN r1) {
        this.A00 = r1;
    }

    public final void invoke(AnonymousClass3JD r11) {
        C250663lr A0U;
        Boolean bool;
        ImmutableList requiredCompactedTreeListField;
        if (r11 != null && (A0U = C41845B3m.A0U(r11)) != null) {
            Class<C43124BtA> cls = C43124BtA.class;
            C250663lr optionalTreeField = A0U.getOptionalTreeField(0, "ig_supervised_user_quiet_time_settings_subscribe(data:$input)", cls, 504197741);
            if (optionalTreeField != null) {
                bool = C41846B3n.A0d(optionalTreeField, "is_quiet_mode_enforcement_non_blocking", 1);
            } else {
                bool = null;
            }
            C250663lr optionalTreeField2 = A0U.getOptionalTreeField(0, "ig_supervised_user_quiet_time_settings_subscribe(data:$input)", cls, 504197741);
            if (optionalTreeField2 != null && (requiredCompactedTreeListField = optionalTreeField2.getRequiredCompactedTreeListField(0, "quiet_time_intervals_for_enforcement", C43123Bt9.class, 1190652765)) != null) {
                ArrayList A0p = AnonymousClass7TF.A0p(requiredCompactedTreeListField);
                Iterator it = requiredCompactedTreeListField.iterator();
                while (it.hasNext()) {
                    C250663lr A0V = C41845B3m.A0V(it);
                    ImmutableList requiredCompactedEnumListField = A0V.getRequiredCompactedEnumListField(0, "days", EWX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    0qQ.A07(requiredCompactedEnumListField);
                    ArrayList A0p2 = AnonymousClass7TF.A0p(requiredCompactedEnumListField);
                    Iterator it2 = requiredCompactedEnumListField.iterator();
                    while (it2.hasNext()) {
                        Object obj = DayOfTheWeek.A01.get(((EWX) it2.next()).name());
                        if (obj == null) {
                            obj = DayOfTheWeek.UNRECOGNIZED;
                        }
                        A0p2.add(obj);
                    }
                    A0p.add(new C47214Dt1(C41846B3n.A0g(A0V, "end_time", 1), C41846B3n.A0g(A0V, TraceFieldType.StartTime, 3), A0V.A09("label"), A0p2));
                }
                2MN.A00(this.A00, bool, A0p);
            }
        }
    }
}
