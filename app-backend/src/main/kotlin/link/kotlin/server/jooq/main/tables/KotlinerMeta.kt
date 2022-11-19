/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables


import java.util.function.Function

import kotlin.collections.List

import link.kotlin.server.jooq.main.Public
import link.kotlin.server.jooq.main.keys.KOTLINER_META_PKEY
import link.kotlin.server.jooq.main.keys.KOTLINER_META__KOTLINER_META_KOTLINER_ID_FKEY
import link.kotlin.server.jooq.main.keys.UNIQUE_KOTLINER_META
import link.kotlin.server.jooq.main.tables.records.KotlinerMetaRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row4
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class KotlinerMeta(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, KotlinerMetaRecord>?,
    aliased: Table<KotlinerMetaRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<KotlinerMetaRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.kotliner_meta</code>
         */
        val KOTLINER_META: KotlinerMeta = KotlinerMeta()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<KotlinerMetaRecord> = KotlinerMetaRecord::class.java

    /**
     * The column <code>public.kotliner_meta.kotliner_id</code>.
     */
    val KOTLINER_ID: TableField<KotlinerMetaRecord, Long?> = createField(DSL.name("kotliner_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.kotliner_meta.id</code>.
     */
    val ID: TableField<KotlinerMetaRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.kotliner_meta.meta_key</code>.
     */
    val META_KEY: TableField<KotlinerMetaRecord, String?> = createField(DSL.name("meta_key"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.kotliner_meta.meta_value</code>.
     */
    val META_VALUE: TableField<KotlinerMetaRecord, String?> = createField(DSL.name("meta_value"), SQLDataType.CLOB.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<KotlinerMetaRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<KotlinerMetaRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.kotliner_meta</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.kotliner_meta</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.kotliner_meta</code> table reference
     */
    constructor(): this(DSL.name("kotliner_meta"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, KotlinerMetaRecord>): this(Internal.createPathAlias(child, key), child, key, KOTLINER_META, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<KotlinerMetaRecord, Long?> = super.getIdentity() as Identity<KotlinerMetaRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<KotlinerMetaRecord> = KOTLINER_META_PKEY
    override fun getUniqueKeys(): List<UniqueKey<KotlinerMetaRecord>> = listOf(UNIQUE_KOTLINER_META)
    override fun getReferences(): List<ForeignKey<KotlinerMetaRecord, *>> = listOf(KOTLINER_META__KOTLINER_META_KOTLINER_ID_FKEY)

    private lateinit var _kotliner: Kotliner

    /**
     * Get the implicit join path to the <code>public.kotliner</code> table.
     */
    fun kotliner(): Kotliner {
        if (!this::_kotliner.isInitialized)
            _kotliner = Kotliner(this, KOTLINER_META__KOTLINER_META_KOTLINER_ID_FKEY)

        return _kotliner;
    }

    val kotliner: Kotliner
        get(): Kotliner = kotliner()
    override fun `as`(alias: String): KotlinerMeta = KotlinerMeta(DSL.name(alias), this)
    override fun `as`(alias: Name): KotlinerMeta = KotlinerMeta(alias, this)
    override fun `as`(alias: Table<*>): KotlinerMeta = KotlinerMeta(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): KotlinerMeta = KotlinerMeta(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): KotlinerMeta = KotlinerMeta(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): KotlinerMeta = KotlinerMeta(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<Long?, Long?, String?, String?> = super.fieldsRow() as Row4<Long?, Long?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, Long?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, Long?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
