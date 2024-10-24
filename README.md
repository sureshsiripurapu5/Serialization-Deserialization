## Serialization:
- Converting the java object in to stream of bytes to store in the database ,or to sent over the network.

## Deserialization:
- Converting the byte stream in to the java object.

## Advantages of serialization and deserialization.
- As we all know tthat java is platform independent beacuse it follows (WORA), so we searialize the object in one operating system,and deserialize in other operating system.
- Example: It we two diffrenet operating system like Macos and Windows ,we can serialize in Macos and deserialize in windows.

## Disadvantages of serialization and deserialization.
- suppose if we take a scenario like Bank Object,assume that it has fields like bankId, password. what if we serialize that object and sent through the network. so that the object data gets manipulated by the third party.

- To solve this type of problems, java came with the solution. Easily mark the sensitive field with the transient keyword.
- If we mark the field with the transient keyword the respective fields does not serializes and deserializes.

- Example:
    --int bankId;
    --transient String password;



