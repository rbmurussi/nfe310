/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.LengthUnits
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.Unit
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.UnitWithValue
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.conversion.Area
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.conversion.Length
 */
package br.gov.sp.fazenda.dsge.brazilutils.metrics.conversion;

import br.gov.sp.fazenda.dsge.brazilutils.metrics.LengthUnits;
import br.gov.sp.fazenda.dsge.brazilutils.metrics.Unit;
import br.gov.sp.fazenda.dsge.brazilutils.metrics.UnitWithValue;
import br.gov.sp.fazenda.dsge.brazilutils.metrics.conversion.Area;
import java.math.BigDecimal;

public class Length
implements LengthUnits,
UnitWithValue {
    private static final long a = 290043788217178584L;
    private Unit a;
    private transient BigDecimal a;
    private final transient BigDecimal b;

    public Length(BigDecimal value, Unit unit) {
        this.b = value.multiply(unit.getValueOnBaseUnit());
        this.a = value;
        this.a = unit;
    }

    public UnitWithValue convertTo(Unit unit, int scale, int roundingmode) {
        return new Area(this.b.divide(unit.getValueOnBaseUnit(), scale, roundingmode), unit);
    }

    public Unit getUnit() {
        return this.a;
    }

    public void setUnit(Unit u) {
        this.a = u;
        this.a = this.b.divide(this.a.getValueOnBaseUnit());
    }

    public BigDecimal getValue() {
        return this.a;
    }

    public String toString() {
        return this.getValue().toString();
    }
}

