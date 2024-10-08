package X;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* renamed from: X.55r  reason: invalid class name and case insensitive filesystem */
public final class C2810655r extends 1XP {
    public final 2ZL A00;

    public final String A00() {
        1Qb A002 = this.A00.A00();
        if (A002 != null) {
            InputStream AjD = A002.AjD();
            try {
                StringBuilder sb = new StringBuilder();
                1r9.A01(new BufferedReader(new InputStreamReader(AjD, StandardCharsets.UTF_8)), new C2810755s(sb));
                String obj = sb.toString();
                0qQ.A07(obj);
                return obj;
            } catch (IOException unused) {
            }
        }
        return "";
    }

    public final boolean isOk() {
        if (this.A00.A02 == 200) {
            return true;
        }
        return false;
    }

    public C2810655r(2ZL r1) {
        this.A00 = r1;
    }
}
