package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

public final class PzZ implements 2G6 {
    public final C13657TeO A00;
    public final C13658TeP A01;
    public final TypeToken A02;
    public final Class A03;
    public final boolean A04;

    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        TypeToken typeToken2 = this.A02;
        TypeToken typeToken3 = typeToken;
        if (typeToken2 != null) {
            if (!typeToken2.equals(typeToken) && (!this.A04 || typeToken2.type != typeToken.rawType)) {
                return null;
            }
        } else if (!this.A03.isAssignableFrom(typeToken.rawType)) {
            return null;
        }
        return new C7208Pza(gson, this.A00, this.A01, this, typeToken3, true);
    }

    public PzZ(TypeToken typeToken, Class cls, Object obj, boolean z) {
        C13658TeP teP;
        C13657TeO teO = null;
        if (obj instanceof C13658TeP) {
            teP = (C13658TeP) obj;
        } else {
            teP = null;
        }
        this.A01 = teP;
        teO = obj instanceof C13657TeO ? (C13657TeO) obj : teO;
        this.A00 = teO;
        if (teP == null && teO == null) {
            throw Pxe.A0g();
        }
        this.A02 = typeToken;
        this.A04 = z;
        this.A03 = cls;
    }
}
