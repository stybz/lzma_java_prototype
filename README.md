# lzma_java_prototype

We'd like to decompress a zip file with LZMA in java. We couldn't.
The file is this one: https://opendata.government.bg/static/TR-2008-2016.zip

We've tried:
- Apache Commons with tukaani (the dictionary is too big in our file - Uncompressed size is too big)
- SevenZip (couldn't make it work)
- TrueZip (compression method 14 is not supported)
- Zip4J (unsupported)
- java.util.zip.ZipEntry (invalid compression method)


If anyone knows a solution, please let us know