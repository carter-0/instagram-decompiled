package X;

import com.instagram.android.R;
import java.util.LinkedList;
import java.util.Queue;

public final class XnB {
    public boolean A00;
    public final C61250m8 A01;
    public final C21401Xa9 A02;
    public final Queue A03 = new LinkedList();

    public static final void A00(C21401Xa9 xa9, XnB xnB, Queue queue) {
        if (!xnB.A00) {
            int i = xa9.A00;
            for (int size = queue.size(); size < i; size++) {
                xnB.A01.A00(new Y0A(xnB), R.layout.sponsored_content_server_rendered_layout);
            }
        }
    }

    public XnB(C61250m8 r2, C21401Xa9 xa9) {
        this.A02 = xa9;
        this.A01 = r2;
    }
}
