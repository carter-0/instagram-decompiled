package X;

import com.meta.foa.session.FoaUserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vcq  reason: case insensitive filesystem */
public final class C17721Vcq {
    public C62320sa A00;
    public final AnonymousClass07Z A01;
    public final AnonymousClass07g A02;
    public final C49726F3q A03;
    public final C51892G6h A04;
    public final C49719F3f A05;
    public final Vk7 A06;
    public final FoaUserSession A07;
    public final Object A08;
    public final List A09 = new ArrayList();
    public final List A0A = new ArrayList();
    public final List A0B = new ArrayList();
    public final List A0C = new ArrayList();
    public final Map A0D = new HashMap();

    public C17721Vcq(AnonymousClass07Z r3, AnonymousClass07g r4, C49726F3q f3q, C51892G6h g6h, C49719F3f f3f, Vk7 vk7, FoaUserSession foaUserSession, Object obj) {
        this.A03 = f3q;
        this.A06 = vk7;
        this.A07 = foaUserSession;
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = f3f;
        this.A08 = obj;
        this.A04 = g6h;
        r3.getLifecycle().A09(new WE5(this));
    }
}
