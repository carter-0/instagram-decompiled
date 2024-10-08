package com.facebook.common.json;

import X.002;
import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.C12837T9j;
import X.C268554db;
import X.C269674fV;
import X.SS5;
import X.TA4;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public abstract class FbJsonField {
    public final Field A00;
    public final Method A01;

    public class BeanJsonField extends FbJsonField {
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0075 A[Catch:{ Exception -> 0x00a2 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void deserialize(java.lang.Object r14, X.16F r15, X.C269674fV r16) {
            /*
                r13 = this;
                java.lang.reflect.Method r3 = r13.A01     // Catch:{ Exception -> 0x00a2 }
                r12 = 0
                if (r3 == 0) goto L_0x002e
                java.lang.reflect.Type[] r0 = r3.getGenericParameterTypes()     // Catch:{ Exception -> 0x00a2 }
                r2 = r0[r12]     // Catch:{ Exception -> 0x00a2 }
            L_0x000b:
                X.16L r0 = r15.A11()     // Catch:{ Exception -> 0x00a2 }
                X.16L r1 = X.16L.A0G     // Catch:{ Exception -> 0x00a2 }
                if (r0 == r1) goto L_0x009e
                boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType     // Catch:{ Exception -> 0x00a2 }
                if (r0 == 0) goto L_0x0069
                r0 = r2
                java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0     // Catch:{ Exception -> 0x00a2 }
                java.lang.reflect.Type r8 = r0.getRawType()     // Catch:{ Exception -> 0x00a2 }
                java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ Exception -> 0x00a2 }
                java.lang.reflect.Type[] r4 = r0.getActualTypeArguments()     // Catch:{ Exception -> 0x00a2 }
                java.lang.Class<com.google.common.collect.ImmutableList> r0 = com.google.common.collect.ImmutableList.class
                boolean r0 = r0.isAssignableFrom(r8)     // Catch:{ Exception -> 0x00a2 }
                if (r0 == 0) goto L_0x0069
                int r0 = r4.length     // Catch:{ Exception -> 0x00a2 }
                goto L_0x0035
            L_0x002e:
                java.lang.reflect.Field r0 = r13.A00     // Catch:{ Exception -> 0x00a2 }
                java.lang.reflect.Type r2 = r0.getGenericType()     // Catch:{ Exception -> 0x00a2 }
                goto L_0x000b
            L_0x0035:
                boolean r0 = X.C66581MXm.A1V(r0)
                X.17k.A0F(r0)     // Catch:{ Exception -> 0x00a2 }
                X.4eE r2 = X.AnonymousClass4eE.A0A     // Catch:{ Exception -> 0x00a2 }
                r0 = r4[r12]     // Catch:{ Exception -> 0x00a2 }
                X.4eF r6 = r2.A09(r0)     // Catch:{ Exception -> 0x00a2 }
                java.lang.reflect.TypeVariable[] r0 = r8.getTypeParameters()     // Catch:{ Exception -> 0x00a2 }
                if (r0 == 0) goto L_0x0059
                int r2 = r0.length     // Catch:{ Exception -> 0x00a2 }
                r0 = 1
                if (r2 != r0) goto L_0x0059
                X.4eI r7 = X.C268924eI.A01(r6, r8)     // Catch:{ Exception -> 0x00a2 }
            L_0x0052:
                java.lang.Class r0 = r8.getSuperclass()     // Catch:{ Exception -> 0x00a2 }
                if (r0 != 0) goto L_0x005e
                goto L_0x005c
            L_0x0059:
                X.4eI r7 = X.C268924eI.A04     // Catch:{ Exception -> 0x00a2 }
                goto L_0x0052
            L_0x005c:
                r5 = 0
                goto L_0x0060
            L_0x005e:
                X.4eJ r5 = X.AnonymousClass4eE.A07     // Catch:{ Exception -> 0x00a2 }
            L_0x0060:
                r9 = 0
                X.Qlt r4 = new X.Qlt     // Catch:{ Exception -> 0x00a2 }
                r10 = r9
                r11 = r9
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00a2 }
                goto L_0x006f
            L_0x0069:
                X.4eE r0 = X.AnonymousClass4eE.A0A     // Catch:{ Exception -> 0x00a2 }
                X.4eF r4 = r0.A09(r2)     // Catch:{ Exception -> 0x00a2 }
            L_0x006f:
                X.16L r0 = r15.A11()     // Catch:{ Exception -> 0x00a2 }
                if (r0 == r1) goto L_0x009e
                X.3kc r0 = r15.A1K()     // Catch:{ Exception -> 0x00a2 }
                X.4db r0 = (X.C268554db) r0     // Catch:{ Exception -> 0x00a2 }
                r1 = r16
                com.fasterxml.jackson.databind.JsonDeserializer r0 = r0.A0K(r1, r4)     // Catch:{ Exception -> 0x00a2 }
                java.lang.Object r2 = r0.A0D(r15, r1)     // Catch:{ Exception -> 0x00a2 }
                if (r2 == 0) goto L_0x00a1
                r1 = 1
                if (r3 == 0) goto L_0x0095
                r3.setAccessible(r1)     // Catch:{ Exception -> 0x00a2 }
                java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch:{ Exception -> 0x00a2 }
                r3.invoke(r14, r0)     // Catch:{ Exception -> 0x00a2 }
                return
            L_0x0095:
                java.lang.reflect.Field r0 = r13.A00     // Catch:{ Exception -> 0x00a2 }
                r0.setAccessible(r1)     // Catch:{ Exception -> 0x00a2 }
                r0.set(r14, r2)     // Catch:{ Exception -> 0x00a2 }
                return
            L_0x009e:
                r15.A0z()     // Catch:{ Exception -> 0x00a2 }
            L_0x00a1:
                return
            L_0x00a2:
                r0 = move-exception
                X.SS5.A03(r0)
                X.SS5.A02(r0)
                X.00P r0 = X.AnonymousClass00P.createAndThrow()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.json.FbJsonField.BeanJsonField.deserialize(java.lang.Object, X.16F, X.4fV):void");
        }
    }

    public final class DoubleJsonField extends FbJsonField {
        public void deserialize(Object obj, 16F r7, C269674fV r8) {
            double d = 0.0d;
            try {
                16L A11 = r7.A11();
                if (A11 == 16L.A0G) {
                    r7.A0z();
                } else if (A11 != 16L.A0J || !"NaN".equals(r7.A1Q())) {
                    d = r7.A0U();
                } else {
                    d = Double.NaN;
                }
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, new Object[]{Double.valueOf(d)});
                    return;
                }
                Field field = this.A00;
                field.setAccessible(true);
                field.setDouble(obj, d);
            } catch (Exception e) {
                SS5.A03(e);
                SS5.A02(e);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final class FloatJsonField extends FbJsonField {
        public void deserialize(Object obj, 16F r6, C269674fV r7) {
            float f = 0.0f;
            try {
                16L A11 = r6.A11();
                if (A11 == 16L.A0G) {
                    r6.A0z();
                } else if (A11 != 16L.A0J || !"NaN".equals(r6.A1Q())) {
                    f = r6.A0h();
                } else {
                    f = Float.NaN;
                }
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, new Object[]{Float.valueOf(f)});
                    return;
                }
                Field field = this.A00;
                field.setAccessible(true);
                field.setFloat(obj, f);
            } catch (Exception e) {
                SS5.A03(e);
                SS5.A02(e);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final class ImmutableListJsonField extends FbJsonField {
        public TA4 A00;
        public Class A01;

        public void deserialize(Object obj, 16F r6, C269674fV r7) {
            ImmutableListDeserializer immutableListDeserializer;
            ImmutableList immutableList;
            try {
                Class cls = this.A01;
                TA4 ta4 = this.A00;
                if (r6.A11() == 16L.A0G) {
                    immutableList = ImmutableList.of();
                } else {
                    if (cls != null) {
                        immutableListDeserializer = new ImmutableListDeserializer(cls);
                    } else if (ta4 != null) {
                        immutableListDeserializer = new ImmutableListDeserializer(((C268554db) r6.A1K()).A0M(r7, ta4.A00));
                    } else {
                        throw AnonymousClass7TE.A0w("Need to set simple or generic inner list type!");
                    }
                    immutableList = (ImmutableList) immutableListDeserializer.A0D(r6, r7);
                }
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, new Object[]{immutableList});
                    return;
                }
                Field field = this.A00;
                field.setAccessible(true);
                field.set(obj, immutableList);
            } catch (Exception e) {
                SS5.A03(e);
                SS5.A02(e);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public static FbJsonField jsonFieldWithCreator(Field field) {
        return new FbJsonField(field, (Method) null);
    }

    public abstract void deserialize(Object obj, 16F r2, C269674fV r3);

    public final class BoolJsonField extends FbJsonField {
        public void deserialize(Object obj, 16F r6, C269674fV r7) {
            try {
                boolean A0d = r6.A0d();
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, new Object[]{Boolean.valueOf(A0d)});
                    return;
                }
                Field field = this.A00;
                field.setAccessible(true);
                field.setBoolean(obj, A0d);
            } catch (Exception e) {
                SS5.A03(e);
                SS5.A02(e);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final class IntJsonField extends FbJsonField {
        public void deserialize(Object obj, 16F r6, C269674fV r7) {
            try {
                int A1D = r6.A1D();
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, new Object[]{Integer.valueOf(A1D)});
                    return;
                }
                Field field = this.A00;
                field.setAccessible(true);
                field.setInt(obj, A1D);
            } catch (Exception e) {
                SS5.A03(e);
                SS5.A02(e);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final class ListJsonField extends FbJsonField {
        public TA4 A00;
        public Class A01;
        public JsonDeserializer A02;

        public void deserialize(Object obj, 16F r6, C269674fV r7) {
            Object obj2;
            try {
                if (r6.A11() == 16L.A0G) {
                    obj2 = AnonymousClass7TE.A1C();
                } else {
                    JsonDeserializer jsonDeserializer = this.A02;
                    if (jsonDeserializer == null) {
                        Class cls = this.A01;
                        if (cls != null) {
                            jsonDeserializer = new ArrayListDeserializer(cls);
                        } else {
                            TA4 ta4 = this.A00;
                            if (ta4 != null) {
                                jsonDeserializer = new ArrayListDeserializer(((C268554db) r6.A1K()).A0M(r7, ta4.A00));
                            } else {
                                throw AnonymousClass7TE.A0w("Need to set simple or generic inner list type!");
                            }
                        }
                        this.A02 = jsonDeserializer;
                    }
                    obj2 = (List) jsonDeserializer.A0D(r6, r7);
                }
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, new Object[]{obj2});
                    return;
                }
                Field field = this.A00;
                field.setAccessible(true);
                field.set(obj, obj2);
            } catch (Exception e) {
                SS5.A03(e);
                SS5.A02(e);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final class LongJsonField extends FbJsonField {
        public void deserialize(Object obj, 16F r7, C269674fV r8) {
            try {
                long A0y = r7.A0y();
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, new Object[]{Long.valueOf(A0y)});
                    return;
                }
                Field field = this.A00;
                field.setAccessible(true);
                field.setLong(obj, A0y);
            } catch (Exception e) {
                SS5.A03(e);
                SS5.A02(e);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final class StringJsonField extends FbJsonField {
        /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Throwable, X.1bF, java.io.IOException] */
        public void deserialize(Object obj, 16F r6, C269674fV r7) {
            String str;
            try {
                if (r6.A11() == 16L.A0G) {
                    r6.A0z();
                    str = null;
                } else {
                    str = r6.A1P();
                    if (str == null) {
                        C12837T9j A1H = r6.A1H();
                        ? iOException = new IOException("Failed to read text from Json stream", (Throwable) null);
                        iOException.A00 = A1H;
                        throw iOException;
                    }
                }
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, new Object[]{str});
                    return;
                }
                Field field = this.A00;
                field.setAccessible(true);
                field.set(obj, str);
            } catch (Exception e) {
                SS5.A03(e);
                SS5.A02(e);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public FbJsonField(Field field, Method method) {
        this.A00 = field;
        this.A01 = method;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.facebook.common.json.FbJsonField, com.facebook.common.json.FbJsonField$ListJsonField] */
    /* JADX WARNING: type inference failed for: r0v16, types: [com.facebook.common.json.FbJsonField, com.facebook.common.json.FbJsonField$ImmutableListJsonField] */
    public static FbJsonField jsonField(Method method, Class cls, TA4 ta4) {
        Class<ArrayList>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 1) {
            Class<ArrayList> cls2 = parameterTypes[0];
            if (cls2 == String.class) {
                return new FbJsonField((Field) null, method);
            }
            if (cls2 == Integer.TYPE) {
                return new FbJsonField((Field) null, method);
            }
            if (cls2 == Long.TYPE) {
                return new FbJsonField((Field) null, method);
            }
            if (cls2 == Boolean.TYPE) {
                return new FbJsonField((Field) null, method);
            }
            if (cls2 == Float.TYPE) {
                return new FbJsonField((Field) null, method);
            }
            if (cls2 == Double.TYPE) {
                return new FbJsonField((Field) null, method);
            }
            if (cls2 == ImmutableList.class) {
                ? fbJsonField = new FbJsonField((Field) null, method);
                fbJsonField.A01 = cls;
                fbJsonField.A00 = ta4;
                return fbJsonField;
            } else if (cls2 != List.class && cls2 != ArrayList.class) {
                return new FbJsonField((Field) null, method);
            } else {
                ? fbJsonField2 = new FbJsonField((Field) null, method);
                fbJsonField2.A01 = cls;
                fbJsonField2.A00 = ta4;
                return fbJsonField2;
            }
        } else {
            throw AnonymousClass7TE.A15(002.A0g("Invalid setter type ", method.getName(), " Only setter with on input parameter is supported."));
        }
    }

    public static FbJsonField jsonField(Field field, TA4 ta4) {
        return jsonField(field, (Class) null, ta4);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.facebook.common.json.FbJsonField, com.facebook.common.json.FbJsonField$ListJsonField] */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.facebook.common.json.FbJsonField, com.facebook.common.json.FbJsonField$ImmutableListJsonField] */
    public static FbJsonField jsonField(Field field, Class cls, TA4 ta4) {
        Class<?> type = field.getType();
        if (type == String.class) {
            return new FbJsonField(field, (Method) null);
        }
        if (type == Integer.TYPE) {
            return new FbJsonField(field, (Method) null);
        }
        if (type == Long.TYPE) {
            return new FbJsonField(field, (Method) null);
        }
        if (type == Boolean.TYPE) {
            return new FbJsonField(field, (Method) null);
        }
        if (type == Float.TYPE) {
            return new FbJsonField(field, (Method) null);
        }
        if (type == Double.TYPE) {
            return new FbJsonField(field, (Method) null);
        }
        if (type == ImmutableList.class) {
            ? fbJsonField = new FbJsonField(field, (Method) null);
            fbJsonField.A01 = cls;
            fbJsonField.A00 = ta4;
            return fbJsonField;
        } else if (type != List.class && type != ArrayList.class) {
            return new FbJsonField(field, (Method) null);
        } else {
            ? fbJsonField2 = new FbJsonField(field, (Method) null);
            fbJsonField2.A01 = cls;
            fbJsonField2.A00 = ta4;
            return fbJsonField2;
        }
    }

    public static FbJsonField jsonField(Field field, Class cls) {
        return jsonField(field, cls, (TA4) null);
    }

    public static FbJsonField jsonField(Method method, TA4 ta4) {
        return jsonField(method, (Class) null, ta4);
    }

    public static FbJsonField jsonField(Method method, Class cls) {
        return jsonField(method, cls, (TA4) null);
    }

    public static FbJsonField jsonField(Field field) {
        return jsonField(field, (Class) null, (TA4) null);
    }

    public static FbJsonField jsonField(Method method) {
        return jsonField(method, (Class) null, (TA4) null);
    }
}
