package X;

import com.facebook.quicklog.MarkerEditor;

/* renamed from: X.37H  reason: invalid class name */
public final class AnonymousClass37H extends AnonymousClass37I implements AnonymousClass37J {
    public final String A00;
    public final String A01;

    public final void ABp(MarkerEditor markerEditor) {
        0qQ.A0B(markerEditor, 0);
        StringBuilder sb = new StringBuilder();
        sb.append('/');
        sb.append(this.A01);
        sb.append('/');
        sb.append(this.A00);
        markerEditor.point(sb.toString(), (String) null, this.A00);
    }

    public AnonymousClass37H(String str, String str2, long j) {
        super("", j);
        this.A01 = str;
        this.A00 = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("markerPoint /");
        sb.append(this.A01);
        sb.append('/');
        sb.append(this.A00);
        sb.append(" at ");
        sb.append(this.A00);
        return sb.toString();
    }
}
