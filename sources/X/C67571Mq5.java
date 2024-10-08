package X;

import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Mq5  reason: case insensitive filesystem */
public abstract class C67571Mq5 {
    public boolean A00;
    public final 02m A01;

    public static void A00(02m r3, Map map, int i) {
        String valueOf;
        MarkerEditor withMarker = r3.withMarker(i, 0);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String A13 = DbT.A13(A1J);
            Object value = A1J.getValue();
            if (value instanceof Integer) {
                withMarker.annotate(A13, AnonymousClass7TE.A0M(value));
            } else if (value instanceof Long) {
                withMarker.annotate(A13, AnonymousClass7TE.A0R(value));
            } else if ((value instanceof Double) || (value instanceof Number)) {
                withMarker.annotate(A13, ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                withMarker.annotate(A13, AnonymousClass7TE.A1a(value) & true);
            } else {
                if (value instanceof String) {
                    valueOf = (String) value;
                } else if (value instanceof int[]) {
                    withMarker.annotate(A13, (int[]) value);
                } else if (value instanceof long[]) {
                    withMarker.annotate(A13, (long[]) value);
                } else if (value instanceof double[]) {
                    withMarker.annotate(A13, (double[]) value);
                } else if (value instanceof boolean[]) {
                    withMarker.annotate(A13, (boolean[]) value);
                } else {
                    valueOf = String.valueOf(value);
                }
                withMarker.annotate(A13, valueOf);
            }
        }
        withMarker.markerEditingCompleted();
    }

    public final void A01(int i, int i2, String str, Map map) {
        String valueOf;
        if (this.A00) {
            MarkerEditor withMarker = this.A01.withMarker(i, i2);
            PointEditor pointEditor = withMarker.pointEditor(str);
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry entry = (Map.Entry) A0u.next();
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    pointEditor.addPointData(str2, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    pointEditor.addPointData(str2, ((Number) value).longValue());
                } else if ((value instanceof Double) || (value instanceof Number)) {
                    pointEditor.addPointData(str2, ((Number) value).doubleValue());
                } else if (value instanceof Boolean) {
                    pointEditor.addPointData(str2, ((Boolean) value).booleanValue() & true);
                } else {
                    if (value instanceof String) {
                        valueOf = (String) value;
                    } else if (value instanceof int[]) {
                        pointEditor.addPointData(str2, (int[]) value);
                    } else if (value instanceof long[]) {
                        pointEditor.addPointData(str2, (long[]) value);
                    } else if (value instanceof double[]) {
                        pointEditor.addPointData(str2, (double[]) value);
                    } else if (value instanceof boolean[]) {
                        pointEditor.addPointData(str2, (boolean[]) value);
                    } else {
                        valueOf = String.valueOf(value);
                    }
                    pointEditor.addPointData(str2, valueOf);
                }
            }
            pointEditor.pointEditingCompleted();
            withMarker.markerEditingCompleted();
        }
    }

    public final void A02(int i, int i2, Map map) {
        String valueOf;
        if (this.A00) {
            02m r2 = this.A01;
            r2.markerStart(i, i2);
            if (map != null && !map.isEmpty() && this.A00) {
                MarkerEditor withMarker = r2.withMarker(i, 0);
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (A0u.hasNext()) {
                    Map.Entry entry = (Map.Entry) A0u.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        withMarker.annotate(str, ((Number) value).intValue());
                    } else if (value instanceof Long) {
                        withMarker.annotate(str, ((Number) value).longValue());
                    } else if ((value instanceof Double) || (value instanceof Number)) {
                        withMarker.annotate(str, ((Number) value).doubleValue());
                    } else if (value instanceof Boolean) {
                        withMarker.annotate(str, ((Boolean) value).booleanValue() & true);
                    } else {
                        if (value instanceof String) {
                            valueOf = (String) value;
                        } else if (value instanceof int[]) {
                            withMarker.annotate(str, (int[]) value);
                        } else if (value instanceof long[]) {
                            withMarker.annotate(str, (long[]) value);
                        } else if (value instanceof double[]) {
                            withMarker.annotate(str, (double[]) value);
                        } else if (value instanceof boolean[]) {
                            withMarker.annotate(str, (boolean[]) value);
                        } else {
                            valueOf = String.valueOf(value);
                        }
                        withMarker.annotate(str, valueOf);
                    }
                }
                withMarker.markerEditingCompleted();
            }
        }
    }

    public final void A03(Throwable th, int i, int i2) {
        short s;
        if (this.A00) {
            02m r2 = this.A01;
            if (th == null) {
                s = 2;
            } else {
                r2.markerAnnotate(i, i2, "error", th.getMessage());
                s = 3;
            }
            r2.markerEnd(i, i2, s);
        }
    }

    public C67571Mq5(02m r1) {
        this.A01 = r1;
    }
}
